package io.github.bael.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationXMLConfig.xml");
        PetService service = applicationContext.getBean(PetService.class);
        PetService serviceByName = (PetService) applicationContext.getBean("PetService");


        System.out.println(service.adorablePet().speak());
        System.out.println(serviceByName.adorablePet().speak());
    }
}
