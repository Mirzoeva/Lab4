package lab4;

import akka.actor.*;
import akka.japi.pf.ReceiveBuilder;
import akka.routing.RoundRobinPool;

import java.time.Duration;
import java.util.Collections;

public class RouterActor extends AbstractActor {
    private ActorRef storageActor;
    private SupervisorStrategy strategy;
    private ActorRef router;

    RouterActor(ActorSystem system){
        this.storageActor = system.actorOf(Props.create(StorageActors.class), "StorageActor");
        this.strategy = new OneForOneStrategy(
                Constans.retriesCount,
                Duration.ofMinutes(1),
                Collections.singletonList(Exception.class)
        );
        this.router = system.actorOf(
                new RoundRobinPool(Constans.workesCount)
                        .withSupervisorStrategy(strategy)
                        .props(Props.create(TesterActor.class, storageActor))
        );
    }

    @Override Receive createReceive(){
        return ReceiveBuilder.create()
                .match(TestPackage.class, msg -> RunTests(msg))
                .match(String.class, msg -> storageActor.forward(msg, getContext()))
                .build();

    }

}