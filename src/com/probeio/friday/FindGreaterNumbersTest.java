package com.probeio.friday;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindGreaterNumbersTest {

    @Test
    public void findGreaterNumbers() {
        assertEquals(3, new FindGreaterNumbers().findGreaterNumbers(new int[]{1, 2, 3}));
    }

    @Test
    public void findGreaterNumbers2() {
        assertEquals(4, new FindGreaterNumbers().findGreaterNumbers(new int[]{6, 1, 2, 7}));
    }

    @Test
    public void findGreaterNumbers3() {
        assertEquals(0, new FindGreaterNumbers().findGreaterNumbers(new int[]{5, 4, 3, 2, 1}));
    }
}