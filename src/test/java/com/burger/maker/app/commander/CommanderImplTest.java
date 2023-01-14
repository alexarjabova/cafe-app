package com.burger.maker.app.commander;

import org.junit.jupiter.api.Test;

class CommanderImplTest {

    @Test
    public void testMediator() throws Exception {
        Commander commander= new CommanderImpl();

        Drink mohito = new Mohito(commander);
        Drink aperol = new Aperol(commander);

        commander.registerCommandForBarkeeper(mohito, aperol);

        commander.start(mohito);
        commander.start(aperol);
        commander.stop(mohito);
        commander.start(mohito);
    }
}