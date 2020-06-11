package in.psg.springdi.controllers;

import in.psg.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

   SetterInjectedController setterInjectedController;

   @BeforeEach
   void setUp() {
      setterInjectedController = new SetterInjectedController();
      setterInjectedController.setGreetingService(new GreetingServiceImpl());
   }

   @Test
   void getGreeting() {
      System.out.println(setterInjectedController.getGreeting());
   }
}