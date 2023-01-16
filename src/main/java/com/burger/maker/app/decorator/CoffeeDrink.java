package com.burger.maker.app.decorator;

import lombok.Getter;

public abstract class CoffeeDrink {
    @Getter
    String description;
    public abstract double cost();

}
