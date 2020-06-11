package in.psg.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

   public static void main(String[] args) {
      ApplicationContext applicationContext=SpringApplication.run(SpringDiApplication.class, args);

   }

}
