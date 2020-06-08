package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void myAtoi() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(42, stringToInteger.myAtoi("42"));
    }

    @Test
    public void myAtoi2() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(4193, stringToInteger.myAtoi("4193 with words"));
    }

    @Test
    public void myAtoi3() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(0, stringToInteger.myAtoi("words and 987"));
    }

    @Test
    public void myAtoi4() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(-2147483648, stringToInteger.myAtoi("-91283472332"));
    }

    @Test
    public void myAtoi5() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(-42, stringToInteger.myAtoi("   -42"));
    }

    @Test
    public void myAtoi6() {
        StringToInteger stringToInteger = new StringToInteger();
        assertEquals(1, stringToInteger.myAtoi("+1"));
    }

}