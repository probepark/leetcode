package com.probeio.friday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestScoringWord {
    public String highestScoringWord(String input) {
        return Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(s -> s.chars().map(operand -> operand - 96).sum()))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getKey))
                .map(Map.Entry::getValue)
                .flatMap(strings -> strings.stream().findAny())
                .orElse("");
    }
}
