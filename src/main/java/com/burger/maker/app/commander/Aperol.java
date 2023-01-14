package com.burger.maker.app.commander;

public class Aperol implements Drink {
    private final Commander commander;

    public Aperol(Commander commander){
        this.commander=commander;
    }

    @Override
    public void start() {
        if(commander.canStart()) {
            System.out.println("Aperol: Preparing drink.....");
            commander.setInProgress(true);
        } else {
            System.out.println("Aperol: Cannot prepare drink now. Other drink in progress....");
        }
    }

    @Override
    public void  stop() {
        System.out.println("Aperol: drink is ready.....");
        commander.setInProgress(false);
    }
}