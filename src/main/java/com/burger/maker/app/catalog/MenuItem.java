package com.burger.maker.app.catalog;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MenuItem extends CatalogComponent {
    public String itemName;
    public String price;

    @Override
    public void print(){
        System.out.println("Menu item name: "+ itemName +" Price: "+ price);
    }

}
