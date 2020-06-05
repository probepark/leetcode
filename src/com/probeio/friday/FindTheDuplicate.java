package com.probeio.friday;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {

    public int findTheDuplicate(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i : input) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }

}
