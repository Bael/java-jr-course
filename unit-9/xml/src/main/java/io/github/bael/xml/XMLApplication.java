package io.github.bael.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationXMLConfig.xml");
        PetService service = applicationContext.getBean(PetService.class);
        PetService serviceCat = (PetService) applicationContext.getBean("PetServiceCat");
        PetService serviceDog = (PetService) applicationContext.getBean("PetServiceDog");


        System.out.println(serviceDog.adorablePet().speak());
        System.out.println(serviceCat.adorablePet().speak());
        System.out.println("default: " + service.adorablePet().speak());
    }
}