package com.burger.maker.app.catalog;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Cannot add item to menu.");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("Cannot remove item from menu.");
    }
    public String getName(){
        throw new UnsupportedOperationException("Cannot return name of menu item.");
    }
    public String getPrice(){
        throw new UnsupportedOperationException("Cannot return price of menu item.");
    }
    public void print(){
        throw new UnsupportedOperationException("Cannot print information from menu");
    }

}
