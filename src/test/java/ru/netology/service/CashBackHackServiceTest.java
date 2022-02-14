package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void cashBackHackIfAmount800() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(800);

        assertEquals(200, cashBackHackService.remain(800));
    }

    @Test
    public void cashBackHackIfAmount1000() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(1000);

        assertEquals(0, cashBackHackService.remain(1000));
    }
}
