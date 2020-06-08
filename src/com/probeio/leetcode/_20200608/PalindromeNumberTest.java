package com.probeio.leetcode._20200608;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }
}