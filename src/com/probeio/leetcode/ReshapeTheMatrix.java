package com.probeio.leetcode;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int row, int column) {
        int[][] array = new int[row][column];

        int[] all = Arrays.stream(nums).flatMapToInt(Arrays::stream).toArray();
        if (column * row != all.length) {
            return nums;
        }

        for (int i = 0; i < all.length; i++) {
            array[i / column % row][i % column] = all[i];
        }
        return array;
    }
}
