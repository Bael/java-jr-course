package io.githib.bael.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"io.githib.bael.annotations"})
public class AnnotationApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationApplication.class);

        GreeterService service = context.getBean(GreeterService.class);
//
//        System.out.print("Назовите себя:");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        String greeting = service.getGreeter().greeting(name);
//        System.out.println(greeting);

        // example 2

        StartGreeter startGreeter = context.getBean(StartGreeter.class);
        startGreeter.greet();


    }
}
