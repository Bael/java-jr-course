package io.github.bael.javaclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TrainingCenterConfiguration.class);

        TrainingCenter center = context.getBean(TrainingCenter.class);

        System.out.println(center.gloriousWarrior());

        TrainingCenterConfiguration cfg = context.getBean(TrainingCenterConfiguration.class);

        TrainingCenter center2 = cfg.trainingCenter();
        System.out.println(center.equals(center2));

        // @Bean создается только один раз. Почему?
        // класс TrainingCenterConfiguration обертывается прокси, через библиотеку CGLIB
        // внутри вызова метода getBean идет проверка не получался ли уже такой бин, и если да то возвращается он же
        // без инициализации нового

        // Давайте просто посмотрим что в нем
        System.out.println(cfg);

        for (String s : context.getBeanDefinitionNames()) {

            System.out.println(s + ">>" +context.getBean(s));
        }

    }



}
