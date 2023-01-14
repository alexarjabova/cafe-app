package com.burger.maker.app.catalog;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class ProductCatalog extends CatalogComponent{
    private final ArrayList<CatalogComponent> menuItems = new ArrayList<>();
    private String name;

    public ProductCatalog(String name){
        this.name = name;
    }

    @Override
    public void print(){
        for(CatalogComponent comp : menuItems) {
            comp.print();
        }
    }

    @Override
    public void add(CatalogComponent catalogComponent){
        menuItems.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent){
        menuItems.remove(catalogComponent);
    }

}
