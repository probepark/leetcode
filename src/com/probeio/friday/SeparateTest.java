package com.probeio.friday;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeparateTest {

    @Test
    public void separate() {
        Separate separate = new Separate();
        assertArrayEquals(new String[]{"cat", "water", "dog"}, separate.separate(new String[]{"dog", "water", "cat"}));
    }

    @Test
    public void separate2() {
        Separate separate = new Separate();
        assertArrayEquals(new String[]{"cat", "cat", "water", "dog"}, separate.separate(new String[]{"dog", "cat", "water", "cat"}));
    }
}