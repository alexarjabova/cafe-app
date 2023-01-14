package com.burger.maker.app.builder;

import com.burger.maker.app.model.*;

public class FishBurgerBuilder implements BurgerBuilder {

    private Burger burger;

    public FishBurgerBuilder() {
        this.burger = new Burger();
    }

    @Override
    public void addBurgerBun() {
        burger.setBurgerBun(BurgerBun.PLAIN_WHITE_BUN);
        System.out.println("FishBurgerBuilder: BurgerBun complete...");
    }

    @Override
    public void addMustard() {
        burger.setMustard(false);
        System.out.println("FishBurgerBuilder: Mustard complete...");
    }

    @Override
    public void addOnions() {
        burger.setOnions(true);
        System.out.println("FishBurgerBuilder: Onions complete...");
    }

    @Override
    public void addTomatoSauce() {
        burger.setTomatoSauce(false);
        System.out.println("FishBurgerBuilder: TomatoSauce complete...");
    }

    @Override
    public void addLettuce() {
        burger.setLettuce(true);
        System.out.println("FishBurgerBuilder: Lettuce complete...");
    }

    @Override
    public void addVegetables() {
        burger.setVegetables(Vegetables.CUCUMBER);
        System.out.println("FishBurgerBuilder: Vegetables complete...");
    }

    @Override
    public void addCheese() {
        burger.setCheese(Cheese.OLD_ENGLISH_CHEESE);
        System.out.println("FishBurgerBuilder: Cheese complete...");
    }

    @Override
    public void addMayonnaise() {
        burger.setMayonnaise(true);
        System.out.println("FishBurgerBuilder: Mayonnaise complete...");
    }

    @Override
    public void addBurgerPatty() {
        burger.setBurgerPatty(BurgerPatty.FISH);
        System.out.println("FishBurgerBuilder: BurgerPatty complete...");
    }

    @Override
    public Burger getReadyBurger() {
        System.out.println("FishBurgerBuilder: Fish Burger complete...");
        return this.burger;
    }
}
