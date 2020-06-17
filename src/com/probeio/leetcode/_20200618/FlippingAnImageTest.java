package com.probeio.leetcode._20200618;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlippingAnImageTest {

    @Test
    public void flipAndInvertImage() {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int[][] expected = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] input = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        assertArrayEquals(expected, flippingAnImage.flipAndInvertImage(input));
    }
}