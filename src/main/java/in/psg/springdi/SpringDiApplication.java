package in.psg.springdi;

import in.psg.springdi.controllers.ConstructorInjectedController;
import in.psg.springdi.controllers.MyController;
import in.psg.springdi.controllers.PropertyInjectedController;
import in.psg.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

   public static void main(String[] args) {
      ApplicationContext applicationContext=SpringApplication.run(SpringDiApplication.class, args);

      System.out.println("---------Property Injection--------");
      PropertyInjectedController propertyInjectedController = applicationContext.getBean("propertyInjectedController",PropertyInjectedController.class);
      System.out.println(propertyInjectedController.getGreeting());

      System.out.println("---------Setter Injection----------");
      SetterInjectedController setterInjectedController = applicationContext.getBean("setterInjectedController",SetterInjectedController.class);
      System.out.println(setterInjectedController.getGreeting());

      System.out.println("---------Constructor Injection-----");
      ConstructorInjectedController constructorInjectedController = applicationContext.getBean("constructorInjectedController",ConstructorInjectedController.class);
      System.out.println(constructorInjectedController.getGreeting());

      System.out.println("--------Primary Bean-----------------");
      MyController myController = applicationContext.getBean("myController",MyController.class);
      System.out.println(myController.getGreeting());

   }

}
