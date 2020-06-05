package com.probeio.friday;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Separate {
    public String[] separate(String[] input) {
        Map<String, List<String>> groupByString = Arrays.stream(input).collect(Collectors.groupingBy(s -> s));
        return Stream.of(groupByString.get("cat"), groupByString.get("water"), groupByString.get("dog"))
                .flatMap(Collection::stream)
                .toArray(String[]::new);
    }
}
