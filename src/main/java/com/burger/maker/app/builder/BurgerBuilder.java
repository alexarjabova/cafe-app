package com.burger.maker.app.builder;

import com.burger.maker.app.builder.model.Burger;

public interface BurgerBuilder {
    void addBurgerBun();
    void addMustard();
    void addOnions();
    void addTomatoSauce();
    void addLettuce();
    void addVegetables();
    void addCheese();
    void addMayonnaise();
    void addBurgerPatty();

    Burger getReadyBurger();

}
