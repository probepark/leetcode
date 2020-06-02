package com.probeio.leetcode;

import static org.junit.Assert.*;

public class ToGoatLatinTest {

    @org.junit.Test
    public void toGoatLatin() {
        ToGoatLatin toGoatLatin = new ToGoatLatin();
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", toGoatLatin.toGoatLatin("I speak Goat Latin"));
    }
}