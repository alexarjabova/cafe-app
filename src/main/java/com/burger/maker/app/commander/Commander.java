package com.burger.maker.app.commander;

public interface Commander {
    void registerCommandForBarkeeper(Drink mohito, Drink aperol);
    void setInProgress(boolean inProgress);
    boolean canStart();
    void start(Drink drink);
    void stop(Drink drink);

}
