package com.burger.maker.app.builder;

import com.burger.maker.app.builder.model.Burger;
import org.junit.jupiter.api.Test;

class BurgerEngineerTest {

    @Test
    void createBurger() {
        //Initialize Burger Builder for Chicken burger
        BurgerBuilder chickenBurgerBuilder = new ChickenBurgerBuilder();
        //Initialize Burger Engineer for Chicken burger
        BurgerEngineer cook1 = new BurgerEngineer(chickenBurgerBuilder);
        Burger chickenBurger = cook1.createBurger();
        //Print the result
        System.out.println(chickenBurger);


        //Initialize Burger Builder for Fish burger
        FishBurgerBuilder fishBurgerBuilder = new FishBurgerBuilder();
        //Initialize Burger Engineer for Fish burger
        BurgerEngineer cook2 = new BurgerEngineer(fishBurgerBuilder);
        Burger fishBurger = cook2.createBurger();
        //Print the result
        System.out.println(fishBurger);
    }

}