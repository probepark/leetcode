package com.probeio.leetcode._20200608;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String words = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0, j = words.length() - 1; i < words.length(); i++, j--) {
            if (!(words.charAt(i) == words.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
