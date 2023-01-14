package com.burger.maker.app.commands;

import com.burger.maker.app.builder.BurgerBuilder;
import com.burger.maker.app.builder.BurgerEngineer;
import com.burger.maker.app.builder.ChickenBurgerBuilder;
import org.junit.jupiter.api.Test;

class CookCommandTest {

    @Test
    void executeCookCommand() {
        BurgerBuilder chickenBurgerBuilder = new ChickenBurgerBuilder();
        BurgerEngineer cook1 = new BurgerEngineer(chickenBurgerBuilder);
        CookCommand cookCommand = new CookCommand(cook1);
        cookCommand.execute();
    }
}