package com.burger.maker.app.commands;

import com.burger.maker.app.builder.BurgerEngineer;
import lombok.Data;

@Data
public class CookCommand implements Command{
    BurgerEngineer burger;

    public CookCommand(BurgerEngineer burger){
        this.burger = burger;
    }

    public void execute(){
        System.out.println("Check with order is received. Starting cooking burger");
        burger.createBurger();
        System.out.println("Burger is ready! ");
    }

}
