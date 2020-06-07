package com.probeio.leetcode._20200608;

import java.util.stream.IntStream;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return IntStream.range(0, nums.length)
                .map(index -> {
                    if (nums[index] == target) {
                        return index;
                    } else if (nums[index] > target) {
                        return index;
                    } else if (nums.length - 1 == index && nums[index] < target){
                        return index + 1;
                    } else {
                        return -1;
                    }
                })
                .filter(value -> value > -1)
                .findFirst()
                .orElse(0);
    }
}
