package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementStrStrTest {

    @Test
    public void strStr() {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
    }
}