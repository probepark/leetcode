package com.probeio.leetcode._20200608;

import java.util.stream.Collectors;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String origin = String.valueOf(x);
        String newWord = origin.chars()
                .filter(value -> value > 47 && value < 58)
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining());
        if (origin.length() != newWord.length()) {
            return false;
        }

        for (int i = 0, j = newWord.length() - 1; i < newWord.length(); i++, j--) {
            if (!(newWord.charAt(i) == newWord.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
