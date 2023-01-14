package com.burger.maker.app.builder;

import com.burger.maker.app.model.Burger;
import org.junit.jupiter.api.Test;

class BurgerEngineerTest {

    @Test
    void createBurger() {
        BurgerBuilder chickenBurgerBuilder = new ChickenBurgerBuilder();
        BurgerEngineer cook1 = new BurgerEngineer(chickenBurgerBuilder);
        Burger chickenBurger = cook1.createBurger();
        System.out.println(chickenBurger);

        FishBurgerBuilder fishBurgerBuilder = new FishBurgerBuilder();
        BurgerEngineer cook2 = new BurgerEngineer(fishBurgerBuilder);
        Burger fishBurger = cook2.createBurger();
        System.out.println(fishBurger);
    }
}