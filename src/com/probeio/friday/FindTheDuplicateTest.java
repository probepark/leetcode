package com.probeio.friday;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDuplicateTest {

    @Test
    public void findTheDuplicate() {
        assertEquals(1, new FindTheDuplicate().findTheDuplicate(new int[]{1, 2, 1, 4, 3, 12}));
    }

    @Test
    public void findTheDuplicate2() {
        assertEquals(9, new FindTheDuplicate().findTheDuplicate(new int[]{6, 1, 9, 5, 3, 4, 9}));
    }

    @Test
    public void findTheDuplicate3() {
        assertEquals(0, new FindTheDuplicate().findTheDuplicate(new int[]{2, 1, 3, 4}));
    }
}