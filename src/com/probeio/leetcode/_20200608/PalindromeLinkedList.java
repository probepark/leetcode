package com.probeio.leetcode._20200608;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        return isPalindromeInternal(head, new ArrayList<>());
    }

    private boolean isPalindromeInternal(ListNode node, List<Integer> result) {
        result.add(node.val);
        if (node.next == null) {
            for (int i = 0, j = result.size() - 1; i < result.size(); i++, j--) {
                if (!result.get(i).equals(result.get(j))) {
                    return false;
                }
            }
            return true;
        }
        return isPalindromeInternal(node.next, result);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
