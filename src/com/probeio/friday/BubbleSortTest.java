package com.probeio.friday;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[]{2, 3, 4, 7, 8}, bubbleSort.bubbleSort(new int[]{4, 7, 2, 3, 8}));
    }
}