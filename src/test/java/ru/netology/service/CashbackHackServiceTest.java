package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService hackService = new CashbackHackService();

    @Test
    public void testRemain() {

        Assert.assertEquals(100, hackService.remain(900));
    }

    @Test
    public void testRemain2() {

        Assert.assertEquals(1, hackService.remain(999));
    }

    @Test
    public void testRemain3() {

        Assert.assertEquals(999, hackService.remain(1_001));
    }

    @Test
    public void testRemain4() {

        Assert.assertEquals(0, hackService.remain(1_000));
    }

    @Test
    public void testRemain5() {

        Assert.assertEquals(1_000, hackService.remain(0));
    }

    @Test
    public void testRemain6() {

        Assert.assertEquals(0, hackService.remain(-100));
    }
}