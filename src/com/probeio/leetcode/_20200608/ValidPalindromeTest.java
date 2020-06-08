package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome2() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertEquals(false, validPalindrome.isPalindrome("race a car"));
    }
}