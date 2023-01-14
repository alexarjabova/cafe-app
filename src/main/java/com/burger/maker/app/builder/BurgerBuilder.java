package com.burger.maker.app.builder;

import com.burger.maker.app.model.Burger;

public interface BurgerBuilder {
    void addBurgerBun();
    void addMustard();
    void addOnions();
    void addTomatoSauce();
    void addLettuce();
    void addVegetables();
    void addCheese();
    void addMayonnaise();
    void addBurgerPatty(); //chicken, fish

    Burger getReadyBurger();
}
