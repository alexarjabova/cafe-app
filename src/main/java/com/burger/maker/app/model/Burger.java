package com.burger.maker.app.model;


import lombok.Setter;

@Setter
public class Burger {
    private BurgerBun burgerBun;
    private boolean mustard;
    private boolean onions;
    private boolean tomatoSauce;
    private boolean lettuce;
    private Vegetables vegetables;
    private Cheese cheese;
    private boolean mayonnaise;
    private BurgerPatty burgerPatty;

    @Override
    public String toString() {
        return "Your burger will consist of: " +
                "burgerBun=" + burgerBun +
                ", mustard=" + mustard +
                ", onions=" + onions +
                ", tomatoSauce=" + tomatoSauce +
                ", lettuce=" + lettuce +
                ", vegetables=" + vegetables +
                ", cheese=" + cheese +
                ", mayonnaise=" + mayonnaise +
                ", burgerPatty=" + burgerPatty +
                ". Thank you for your order! :) ";
    }
}
