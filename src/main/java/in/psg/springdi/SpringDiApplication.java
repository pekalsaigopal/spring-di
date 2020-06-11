package in.psg.springdi;

import in.psg.springdi.controllers.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

   public static void main(String[] args) {
      ApplicationContext applicationContext=SpringApplication.run(SpringDiApplication.class, args);

      I18nController i18nController = applicationContext.getBean("i18nController",I18nController.class);
      System.out.println(i18nController.getGreeting());

   }

}
