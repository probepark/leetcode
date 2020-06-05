package com.probeio.friday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {

    public int findTheDuplicate(int[] input) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(input)
                .filter(i -> !set.add(i))
                .findFirst()
                .orElse(0);
    }

}
