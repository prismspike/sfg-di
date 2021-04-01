package tobi.fiasko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tobi.fiasko.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}