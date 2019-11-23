package lab4;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;

public class StorageActors extends AbstractActor {

    private Map<String, ArrayList<TestData>> store = new HashMap<>();


    @Override
    public Receive createreceive(){
        return ReceiveBuilder.create()
//                .match()
    }
}
