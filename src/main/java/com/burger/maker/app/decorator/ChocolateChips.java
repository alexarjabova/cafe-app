package com.burger.maker.app.decorator;

public class ChocolateChips extends CoffeeToppings {
    CoffeeDrink coffeeDrink;

    public ChocolateChips(CoffeeDrink coffeeDrink){
        this.coffeeDrink=coffeeDrink;
    }

    public  String getDescription(){
        return coffeeDrink.getDescription() + ", chocolate chips";
    }

    public double cost()
    {
        return 0.20 + coffeeDrink.cost();
    }

}