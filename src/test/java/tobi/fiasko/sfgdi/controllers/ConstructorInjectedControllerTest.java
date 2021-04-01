package tobi.fiasko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tobi.fiasko.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}