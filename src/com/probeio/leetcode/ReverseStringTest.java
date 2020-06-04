package com.probeio.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverseString() {
        ReverseString reverseString = new ReverseString();
        char[] expected = new StringBuilder("hello").reverse().toString().toCharArray();
        char[] input = "hello".toCharArray();
        reverseString.reverseString(input);
        assertArrayEquals(expected, input);
    }
}