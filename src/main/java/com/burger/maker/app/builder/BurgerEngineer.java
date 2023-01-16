package com.burger.maker.app.builder;

import com.burger.maker.app.builder.model.Burger;

public class BurgerEngineer {
    private BurgerBuilder burgerBuilder;

    public BurgerEngineer(BurgerBuilder burgerBuilder){
        this.burgerBuilder = burgerBuilder;
    }

    public Burger createBurger() {
        this.burgerBuilder.addBurgerBun();
        this.burgerBuilder.addMustard();
        this.burgerBuilder.addOnions();
        this.burgerBuilder.addTomatoSauce();
        this.burgerBuilder.addLettuce();
        this.burgerBuilder.addVegetables();
        this.burgerBuilder.addCheese();
        this.burgerBuilder.addMayonnaise();
        this.burgerBuilder.addBurgerPatty();
        return this.burgerBuilder.getReadyBurger();
    }

}
