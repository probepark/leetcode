package com.probeio.leetcode._20200608;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public int myAtoi(String str) {
        String newStr = str.trim();
        if (newStr.isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("^[-+]?[0-9]+");
        Matcher matcher = pattern.matcher(newStr);
        if (!matcher.find()) {
            return 0;
        }
        try {
            return Integer.parseInt(matcher.group(0));
        } catch (NumberFormatException e) {
            return newStr.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
