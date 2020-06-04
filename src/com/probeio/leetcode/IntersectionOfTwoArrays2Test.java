package com.probeio.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionOfTwoArrays2Test {

    @Test
    public void intersect() {
        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        assertArrayEquals(new int[]{2, 2}, intersectionOfTwoArrays2.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}