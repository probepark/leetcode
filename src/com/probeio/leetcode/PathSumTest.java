package com.probeio.leetcode;

import org.junit.Test;

import static com.probeio.leetcode.PathSum.TreeNode;
import static org.junit.Assert.assertEquals;

public class PathSumTest {

    @Test
    public void hasPathSum() {
        PathSum pathSum = new PathSum();
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1)))
        );
        assertEquals(true, pathSum.hasPathSum(root, 22));
    }

    @Test
    public void hasPathSum2() {
        PathSum pathSum = new PathSum();
        assertEquals(false, pathSum.hasPathSum(new TreeNode(0), 1));
    }

    @Test
    public void hasPathSum3() {
        PathSum pathSum = new PathSum();
        assertEquals(false, pathSum.hasPathSum(new TreeNode(), 0));
    }

    @Test
    public void hasPathSum4() {
        PathSum pathSum = new PathSum();
        assertEquals(false, pathSum.hasPathSum(new TreeNode(1), 0));
    }

    @Test
    public void hasPathSum5() {
        PathSum pathSum = new PathSum();
        assertEquals(false, pathSum.hasPathSum(new TreeNode(1, new TreeNode(2), null), 1));
    }

}