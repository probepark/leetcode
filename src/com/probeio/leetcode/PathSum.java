package com.probeio.leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null || root.val == 0 && sum == 0) {
            return false;
        }
        return hasPathSumInternal(root, sum);
    }

    boolean hasPathSumInternal(TreeNode node, int sum) {
        if (node == null) {
            return false;
        }
        sum -= node.val;
        if (sum == 0 && node.left == null && node.right == null) {
            return true;
        }
        return hasPathSumInternal(node.left, sum) || hasPathSumInternal(node.right, sum);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
