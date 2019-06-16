package io.github.bael.javaclass;

import io.github.bael.javaclass.war.ActorState;
import io.github.bael.javaclass.war.Knight;
import io.github.bael.javaclass.war.Warrior;
import io.github.bael.javaclass.war.WarriorState;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class KnightTrainingCenter implements TrainingCenter {
    @Override
    public Warrior gloriousWarrior() {
        ActorState state = WarriorState.builder().hp(1000)
                .maxHP(1000).strength(100)
                .attackLevel(100).level(1).defenceLevel(100).build();
        return new Knight(state);
    }

    public void onInited() {
        System.out.println("Life Cycle: KnightTrainingCenter onInited");
    }

    public void onDestroy() {
        System.out.println("Life Cycle: KnightTrainingCenter onDestroy");
    }

    /**
     * The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done
     * to perform any initialization.
     * This method MUST be invoked before the class is put into service.
     * This annotation MUST be supported on all classes that support dependency injection.
     * The method annotated with PostConstruct MUST be invoked even if the class does not request any resources to be injected.
     * Only one method in a given class can be annotated with this annotation.
     */
    @PostConstruct
    public void postConstruct() {
        System.out.println("Life Cycle: KnightTrainingCenter @onPostConstruct");
    }

    /**
     * javax.annotation.PreDestroy The PreDestroy annotation is used on a method as a callback notification to signal that
     * the instance is in the process of being removed by the container.
     * The method annotated with PreDestroy is typically used to release resources that the instance has been holding.
     * This annotation MUST be supported by all container managed objects that support PostConstruct except the application client.
     *
     * 
     */
    @PreDestroy
    public void preDestroy() {
        System.out.println("Life Cycle: KnightTrainingCenter @onPreDestroy");

    }

}
