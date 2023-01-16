package com.burger.maker.app.commands;

import com.burger.maker.app.builder.BurgerBuilder;
import com.burger.maker.app.builder.BurgerEngineer;
import com.burger.maker.app.builder.ChickenBurgerBuilder;
import org.junit.jupiter.api.Test;

class CookCommandTest {

    /**
     * Test case to check if the 'executeCookCommand' works as expected.
     * If success - in console output should see messages with Burger
     * cooking process + notification "Burger is ready!".
     */
    @Test
    void executeCookCommand() {
        //Initialize Burger Builder & Burger Engineer
        BurgerBuilder chickenBurgerBuilder = new ChickenBurgerBuilder();
        BurgerEngineer cook1 = new BurgerEngineer(chickenBurgerBuilder);

        //Call 'cookCommand'
        CookCommand cookCommand = new CookCommand(cook1);

        //Result output
        cookCommand.execute();
    }

}