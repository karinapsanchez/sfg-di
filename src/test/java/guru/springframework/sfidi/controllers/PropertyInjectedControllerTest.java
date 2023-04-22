package guru.springframework.sfidi.controllers;

import guru.springframework.sfidi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new ConstructorGreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println(propertyInjectedController.getGreeting());
    }
}