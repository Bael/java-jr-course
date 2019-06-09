package io.github.bael.javaclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TrainingCenterConfiguration.class);

        TrainingCenter center = context.getBean(TrainingCenter.class);

        System.out.println(center.gloriousWarrior());

    }
}
