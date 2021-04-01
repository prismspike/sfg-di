package tobi.fiasko.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tobi.fiasko.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}