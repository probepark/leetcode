package com.probeio.leetcode;


public class ReverseString {
    public void reverseString(char[] input) {
        for (int i = 0, j = input.length - 1; i < input.length / 2; i++, j--) {
            if (input[i] != input[j]) {
                char left = input[i];
                input[i] = input[j];
                input[j] = left;
            }
        }
    }
}
