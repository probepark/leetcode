package com.probeio.leetcode._20200618;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] input) {
        for (int[] chunk : input) {
            int mod = chunk.length % 2;
            for (int j = 0; j < chunk.length / 2 + mod; j++) {
                int temp = chunk[j];
                chunk[j] = chunk[chunk.length - j - 1] > 0 ? 0 : 1;
                chunk[chunk.length - j - 1] = temp > 0 ? 0 : 1;
            }
        }
        return input;
    }
}
