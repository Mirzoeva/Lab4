package lab4;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class StorageActors extends AbstractActor {

    @Override
    public Receive createreceive(){
        return ReceiveBuilder.create()
//                .match()
    }
}
