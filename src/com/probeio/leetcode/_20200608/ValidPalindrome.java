package com.probeio.leetcode._20200608;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9])");

        List<String> words = pattern.matcher(s)
                .results()
                .map(MatchResult::group)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        for (int i = 0, j = words.size() - 1; i < words.size(); i++, j--) {
            if (!words.get(i).equals(words.get(j))) {
                return false;
            }
        }
        return true;
    }
}
