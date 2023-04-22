package guru.springframework.sfidi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
