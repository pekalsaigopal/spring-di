package in.psg.springdi;

import in.psg.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

   public static void main(String[] args) {
      ApplicationContext applicationContext=SpringApplication.run(SpringDiApplication.class, args);
      MyController myController = applicationContext.getBean("myController",MyController.class);
      String myValue=myController.sayHello();
      System.out.println(myValue);
   }

}
