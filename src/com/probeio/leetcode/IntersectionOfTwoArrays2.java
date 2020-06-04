package com.probeio.leetcode;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionOfTwoArrays2 {
    public int[] intersect(int[] left, int[] right) {
        Map<Integer, Long> leftMap = toMap(left);
        Map<Integer, Long> rightMap = toMap(right);
        return IntStream.concat(Arrays.stream(left), Arrays.stream(right))
                .distinct()
                .filter(value -> leftMap.containsKey(value) && rightMap.containsKey(value))
                .flatMap(value -> {
                    if (leftMap.get(value) >= rightMap.get(value)) {
                        return multiply(rightMap, value);
                    } else {
                        return multiply(leftMap, value);
                    }
                })
                .toArray();
    }

    private Map<Integer, Long> toMap(int[] left) {
        return Arrays.stream(left).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private IntStream multiply(Map<Integer, Long> rightMap, int value) {
        return IntStream.range(0, rightMap.get(value).intValue()).map(operand -> value);
    }
}
