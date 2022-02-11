package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public static void shouldCalculateIfAmount400() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(400);

        assertEquals(cashBackHackService.remain(400), 600);

    }

    @Test
    public static void shouldCalculateIfAmount1500() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(1500);

        assertEquals(cashBackHackService.remain(1500), 500);

    }

    @Test
    public static void shouldCalculateIfAmount999() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(999);

        assertEquals(cashBackHackService.remain(999), 1);

    }

    @Test
    public static void shouldCalculateIfAmount0() {
        CashBackHackService cashBackHackService = new CashBackHackService();

        cashBackHackService.remain(0);

        assertEquals(cashBackHackService.remain(0), 1000);

    }

}