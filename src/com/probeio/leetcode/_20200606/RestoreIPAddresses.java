package com.probeio.leetcode._20200606;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return Collections.emptyList();
        }
        List<List<String>> list = splitPermutations(new ArrayList<>(), s, new ArrayList<>());
        return list.stream()
                .filter(strings -> strings.stream().allMatch(s1 -> {
                    if (s1.length() > 3) {
                        return false;
                    }
                    return s1.length() < 2 || !s1.startsWith("0") && Integer.parseInt(s1) <= 255;
                }))
                .map(strings -> String.join(".", strings))
                .collect(Collectors.toList());
    }

    private static List<List<String>> splitPermutations(List<String> left, String right, List<List<String>> result) {
        List<String> concatLeft = Stream.concat(left.stream(), Stream.of(right)).collect(Collectors.toList());
        if (concatLeft.size() == 4) {
            result.add(concatLeft);
        }

        if (right.length() > 1) {
            IntStream.range(1, right.length()).forEach(i -> {
                List<String> newLeft = Stream.concat(left.stream(), Stream.of(right.substring(0, i))).collect(Collectors.toList());
                splitPermutations(newLeft, right.substring(i), result);
            });
        }
        return result;
    }
}
