package com.probeio.friday;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindGreaterNumbers {

    public int findGreaterNumbers(int[] input) {
        return IntStream.range(1, input.length)
                .map(index -> {
                    int start = input[index - 1];
                    return Arrays.stream(input).skip(index).filter(value -> value > start).map(value -> 1).sum();
                })
                .sum();
    }

}
