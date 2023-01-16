package com.burger.maker.app.builder;

import com.burger.maker.app.builder.model.*;

public class ChickenBurgerBuilder implements BurgerBuilder {
    private Burger burger;

    public ChickenBurgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void addBurgerBun() {
        burger.setBurgerBun(BurgerBun.BLACK_BUN);
        System.out.println("ChickenBurgerBuilder: BurgerBun complete...");
    }

    @Override
    public void addMustard() {
        burger.setMustard(true);
        System.out.println("ChickenBurgerBuilder: Mustard complete...");
    }

    @Override
    public void addOnions() {
        burger.setOnions(false);
        System.out.println("ChickenBurgerBuilder: Onions complete...");
    }

    @Override
    public void addTomatoSauce() {
        burger.setTomatoSauce(true);
        System.out.println("ChickenBurgerBuilder: TomatoSauce complete...");
    }

    @Override
    public void addLettuce() {
        burger.setLettuce(true);
        System.out.println("ChickenBurgerBuilder: Lettuce complete...");
    }

    @Override
    public void addVegetables() {
        burger.setVegetables(Vegetables.TOMATO_AND_CUCUMBER);
        System.out.println("ChickenBurgerBuilder: Vegetables complete...");
    }

    @Override
    public void addCheese() {
        burger.setCheese(Cheese.MOZZARELLA_CHEESE);
        System.out.println("ChickenBurgerBuilder: Cheese complete...");
    }

    @Override
    public void addMayonnaise() {
        burger.setMayonnaise(true);
        System.out.println("ChickenBurgerBuilder: Mayonnaise complete...");
    }

    @Override
    public void addBurgerPatty() {
        burger.setBurgerPatty(BurgerPatty.CHICKEN);
        System.out.println("ChickenBurgerBuilder: BurgerPatty complete...");
    }

    @Override
    public Burger getReadyBurger() {
        System.out.println("ChickenBurgerBuilder: Chicken Burger complete...");
        return this.burger;
    }

}
