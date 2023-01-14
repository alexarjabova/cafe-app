package com.burger.maker.app.catalog;

import org.junit.jupiter.api.Test;

public class CatalogComponentTest {

    @Test
    public void testPrint() throws Exception {
        //Create items for main catalog (menu)
        CatalogComponent chickenBurger = new MenuItem("Chicken Burger", "7 EUR");
        CatalogComponent fishBurger = new MenuItem("Fish Burger", "7.50 EUR");

        //Create a new menu
        CatalogComponent menu = new ProductCatalog("Burger menu");

        //Add items to catalog (menu)
        menu.add(chickenBurger);
        menu.add(fishBurger);

        //Print out items from menu
        menu.print();
    }
}