package com.probeio.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReshapeTheMatrixTest {

    @Test
    public void matrixReshape1() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int row = 1;
        int column = 4;

        int[][] expected = {
                {1, 2, 3, 4}
        };
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(nums, row, column));
    }

    @Test
    public void matrixReshape2() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int row = 2;
        int column = 4;

        int[][] expected = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(nums, row, column));
    }

    @Test
    public void matrixReshape3() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int row = 2;
        int column = 2;

        int[][] expected = {
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(nums, row, column));
    }

    @Test
    public void matrixReshape4() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int row = 4;
        int column = 1;

        int[][] expected = {
                {1}, {2}, {3}, {4}
        };
        assertArrayEquals(expected, reshapeTheMatrix.matrixReshape(nums, row, column));
    }

}