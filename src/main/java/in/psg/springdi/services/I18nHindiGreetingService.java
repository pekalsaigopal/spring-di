package in.psg.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HI")
@Service
public class I18nHindiGreetingService implements GreetingService{
   @Override
   public String sayGreeting() {
      return "Namaskar World";
   }
}
