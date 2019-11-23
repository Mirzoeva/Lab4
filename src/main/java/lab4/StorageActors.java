package lab4;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageActors extends AbstractActor {

    private Map<String, ArrayList<TestData>> store = new HashMap<>();

    private void putTest(TestData testData){
        String packageId = testData.getParentPackage().getPackageId();
        if (this.store.containsKey(packageId)){
            this.store.get(packageId).add(testData);
        } else {
            ArrayList<TestData> tests = new ArrayList<>();
            tests.add(testData);
            this.store.put(packageId, tests);
        }
    }

    private ArrayList<TestData> getTests(String packageId) throws Exception{
        if (this.store.containsKey(packageId)){
            return this.store.get(packageId);
        } else {
            throw  new Exception("No such package");
        }
    }

    private RequestAnswer makeResults(String packageId){


    }



    @Override
    public Receive createreceive(){
        return ReceiveBuilder.create()
                .match(TestData.class, test -> this.putTest(test))
                .match(String.class, id -> sender().tell(makeResults(id), self()))
                .build();
    }
}
