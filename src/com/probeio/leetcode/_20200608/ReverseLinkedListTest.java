package com.probeio.leetcode._20200608;

import org.junit.Test;

import static com.probeio.leetcode._20200608.ReverseLinkedList.ListNode;
import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertEquals(expected, reverseLinkedList.reverseList(actual));
    }
}