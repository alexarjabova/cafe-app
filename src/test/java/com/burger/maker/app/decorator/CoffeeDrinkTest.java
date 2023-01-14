package com.burger.maker.app.decorator;

import org.junit.jupiter.api.Test;

class CoffeeDrinkTest {

    @Test
    public void testCoffeeDrink() {
        //Espresso without toppings
        CoffeeDrink espresso = new Espresso();
        System.out.println(espresso.getDescription()
                + " EUR " + espresso.cost());

        //Espresso with toppings
        CoffeeDrink espressoWithTopping = new Espresso();
        espressoWithTopping = new Cinnamon(espressoWithTopping);
        espressoWithTopping = new ChocolateChips(espressoWithTopping);
        System.out.println(espressoWithTopping.getDescription()
                + " EUR " + espressoWithTopping.cost());

        //Latte without toppings
        CoffeeDrink latte = new Latte();
        System.out.println(latte.getDescription()
                + " EUR " + latte.cost());

        //Espresso with toppings
        CoffeeDrink latteWithTopping = new Latte();
        latteWithTopping = new Cinnamon(latteWithTopping);
        latteWithTopping = new ChocolateChips(latteWithTopping);
        System.out.println(latteWithTopping.getDescription()
                + " EUR " + latteWithTopping.cost());
    }
}