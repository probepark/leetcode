package com.probeio.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToGoatLatin {
    public String toGoatLatin(String word) {
        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        String[] chunks = word.split(" ");
        return IntStream.range(0, chunks.length)
                .mapToObj(i -> {
                    String chunk = chunks[i];
                    if (vowelList.contains(chunk.toLowerCase().charAt(0))) {
                        return chunk + "ma" + addA(i);
                    } else {
                        return chunk.substring(1) + chunk.charAt(0) + "ma" + addA(i);
                    }
                })
                .collect(Collectors.joining(" "));
    }

    private String addA(int limit) {
        return Stream.generate(() -> "a").limit(limit + 1).collect(Collectors.joining(""));
    }
}
