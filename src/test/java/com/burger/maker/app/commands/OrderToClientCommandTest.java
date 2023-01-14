package com.burger.maker.app.commands;

import org.junit.jupiter.api.Test;

class OrderToClientCommandTest {

    @Test
    void executeOrderToClient() {
        OrderToClientCommand orderToClientCommand = new OrderToClientCommand();
        orderToClientCommand.execute();
    }
}