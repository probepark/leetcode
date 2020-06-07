package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void searchInsert2() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    public void searchInsert3() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}