package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {

    @Test
    public void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("1", countAndSay.countAndSay(1));
    }

    @Test
    public void countAndSay2() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("11", countAndSay.countAndSay(2));
    }

    @Test
    public void countAndSay3() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("21", countAndSay.countAndSay(3));
    }

    @Test
    public void countAndSay4() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("1211", countAndSay.countAndSay(4));
    }

    @Test
    public void countAndSay5() {
        CountAndSay countAndSay = new CountAndSay();
        assertEquals("111221", countAndSay.countAndSay(5));
    }
}