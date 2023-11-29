package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("i18NService")
public class GreetingServiceQA implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from greeting service impl";
    }
}
