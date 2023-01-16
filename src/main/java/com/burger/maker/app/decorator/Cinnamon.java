package com.burger.maker.app.decorator;

public class Cinnamon extends CoffeeToppings {
    CoffeeDrink coffeeDrink;

    public Cinnamon(CoffeeDrink coffeeDrink){
        this.coffeeDrink=coffeeDrink;
    }

    public  String getDescription(){
        return coffeeDrink.getDescription() + ", cinnamon";
    }

    public double cost()
    {
        return 0.10 + coffeeDrink.cost();
    }

}