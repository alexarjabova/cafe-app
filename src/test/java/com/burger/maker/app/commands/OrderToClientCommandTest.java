package com.burger.maker.app.commands;

import org.junit.jupiter.api.Test;

class OrderToClientCommandTest {

    /**
     * Test case to check that 'orderToClient' command works as expected.
     * If success - should see "Burger is ready! Please, take your order!" message in console output.
     */
    @Test
    void executeOrderToClient() {
        OrderToClientCommand orderToClientCommand = new OrderToClientCommand();
        orderToClientCommand.execute();
    }

}