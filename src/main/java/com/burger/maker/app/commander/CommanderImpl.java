package com.burger.maker.app.commander;

public class CommanderImpl implements Commander {
    Drink mohito, aperol;

    boolean inProgress = true;

    @Override
    public void registerCommandForBarkeeper(Drink mohito, Drink aperol) {
        this.mohito = mohito;
        this.aperol = aperol;
    }
    @Override
    public void setInProgress(boolean inProgress) {
        this.inProgress = inProgress;
    }
    @Override
    public boolean canStart() {
        return inProgress;
    }
    @Override
    public void start(Drink drink) {
        drink.start();
    }
    @Override
    public void stop(Drink drink) {
        drink.stop();
    }

}
