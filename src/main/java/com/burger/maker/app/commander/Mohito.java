package com.burger.maker.app.commander;

public class Mohito implements Drink {
    private final Commander commander;

    public Mohito(Commander commander){
        this.commander=commander;
    }

    @Override
    public void start() {
        if(commander.canStart()) {
            System.out.println("Mohito: Preparing drink.....");
            commander.setInProgress(true);
        } else {
            System.out.println("Mohito: Cannot prepare drink now. Other drink in progress....");
        }
    }

    @Override
    public void  stop() {
        System.out.println("Mohito: drink is ready.....");
        commander.setInProgress(false);
    }
}