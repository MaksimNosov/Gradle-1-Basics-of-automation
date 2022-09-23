package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    CashbackHackService hackService = new CashbackHackService();

    @Test
    public void testRemain() {

        assertEquals(100,hackService.remain(900));
    }

    @Test
    public void testRemain2() {

        assertEquals(1,hackService.remain(999));
    }

    @Test
    public void testRemain3() {

        assertEquals(999,hackService.remain(1_001));
    }

    @Test
    public void testRemain4() {

        assertEquals(1_000,hackService.remain(1_000));
    }

    @Test
    public void testRemain5() {

        assertEquals(1_000,hackService.remain(0));
    }

    @Test
    public void testRemain6() {

        assertEquals(1_100,hackService.remain(-100));
    }
}