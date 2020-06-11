package in.psg.springdi.controllers;

import in.psg.springdi.services.GreetingService;
import in.psg.springdi.services.GreetingServiceImpl;

public class PropertyInjectedController {
   public GreetingService greetingService;

   public String getGreeting(){
      return greetingService.sayGreeting();
   }


}
