package in.psg.springdi.controllers;

import in.psg.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

   private final GreetingService greetingService;

   public I18nController(GreetingService greetingService) {
      this.greetingService = greetingService;
   }

   public String getGreeting(){
      return greetingService.sayGreeting();
   }
}
