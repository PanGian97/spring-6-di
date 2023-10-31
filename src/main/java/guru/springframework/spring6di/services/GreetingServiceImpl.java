package guru.springframework.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello everyone from base service";
    }
}
