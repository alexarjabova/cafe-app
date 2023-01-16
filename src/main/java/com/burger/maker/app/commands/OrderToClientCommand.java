package com.burger.maker.app.commands;

import lombok.Data;

@Data
public class OrderToClientCommand implements Command{
    public void execute(){
        System.out.println("Burger is ready! Please, take your order!");
    }

}
