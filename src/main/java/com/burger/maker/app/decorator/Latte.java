package com.burger.maker.app.decorator;

public class Latte extends CoffeeDrink {

    public Latte(){
        description = "Latte (espresso, streamed milk)";
    }
    public  double cost(){
        return 3.0;
    }
}
