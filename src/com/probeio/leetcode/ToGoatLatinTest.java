package com.probeio.leetcode;

import static org.junit.Assert.*;

public class ToGoatLatinTest {

    @org.junit.Test
    public void toGoatLatin() {
        ToGoatLatin toGoatLatin = new ToGoatLatin();
        long start = System.currentTimeMillis();
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin.toGoatLatin("I speak Goat Latin"));
        long end = System.currentTimeMillis();
        System.err.println(end - start);
    }
}