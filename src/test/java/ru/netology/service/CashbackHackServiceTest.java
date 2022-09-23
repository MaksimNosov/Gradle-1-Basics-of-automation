package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    CashbackHackService hackService = new CashbackHackService();

    @Test
    public void testRemain() {

        assertEquals(hackService.remain(900), 100);
    }

    @Test
    public void testRemain2() {

        assertEquals(hackService.remain(999), 1);
    }

    @Test
    public void testRemain3() {

        assertEquals(hackService.remain(1_001), 999);
    }

    @Test
    public void testRemain4() {

        assertEquals(hackService.remain(1_000), 0);
    }

    @Test
    public void testRemain5() {

        assertEquals(hackService.remain(0), 1_000);
    }

    @Test
    public void testRemain6() {

        assertEquals(hackService.remain(-100), 0);
    }
}