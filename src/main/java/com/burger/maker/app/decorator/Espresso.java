package com.burger.maker.app.decorator;

public class Espresso extends CoffeeDrink {
    public Espresso(){
        description = "Espresso Coffee (1oz espresso)";
    }
    public  double cost(){
        return 2.0;
    }

}
