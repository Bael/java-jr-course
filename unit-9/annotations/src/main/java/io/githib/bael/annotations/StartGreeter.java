package io.githib.bael.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StartGreeter {


    private GreeterService greeterService;

    public void setGreeterService(GreeterService greeterService) {
        this.greeterService = greeterService;
    }


//    public StartGreeter(GreeterService greeterService) {
//        this.greeterService = greeterService;
//    }

    public void greet() {
        System.out.print("Назовите себя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        String greeting = greeterService.getGreeter().greeting(name);
        System.out.println(greeting);
    }
}
