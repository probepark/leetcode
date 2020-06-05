package com.probeio.friday;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindGreaterNumbers {

    public int findGreaterNumbers(int[] input) {
        return IntStream.range(0, input.length)
                .map(index -> {
                    int start = input[index];
                    return Arrays.stream(input).skip(index + 1)
                            .filter(value -> value > start)
                            .map(value -> 1)
                            .sum();
                })
                .sum();
    }

}
