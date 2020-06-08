package com.probeio.leetcode._20200608;

import org.junit.Test;

import static com.probeio.leetcode._20200608.PalindromeLinkedList.*;
import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    @Test
    public void isPalindrome() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1, new ListNode(2));
        assertEquals(false, palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome2() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertEquals(true, palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome3() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1);
        assertEquals(true, palindromeLinkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome4() {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        assertEquals(true, palindromeLinkedList.isPalindrome(head));
    }

}