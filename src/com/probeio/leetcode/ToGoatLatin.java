package com.probeio.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToGoatLatin {
    public String toGoatLatin(String word) {
        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String[] chunks = word.split(" ");
        return IntStream.range(0, chunks.length)
                .mapToObj(transform(vowelList, chunks))
                .collect(Collectors.joining(" "));
    }

    private IntFunction<String> transform(List<Character> vowelList, String[] chunks) {
        return i -> {
            String chunk = chunks[i];
            if (vowelList.contains(chunk.toLowerCase().charAt(0))) {
                return String.join("", chunk, "ma", addA(i));
            } else {
                return String.join("", chunk.substring(1), String.valueOf(chunk.charAt(0)), "ma", addA(i));
            }
        };
    }

    private String addA(int limit) {
        return Stream.generate(() -> "a").limit(limit + 1).collect(Collectors.joining(""));
    }
}
