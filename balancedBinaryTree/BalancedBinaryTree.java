package com.mirraico.leetcode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        int diff = dfs(root);
        return diff != -1;
    }

    public int dfs(TreeNode root) {

        if (null == root) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (-1 == left || -1 == right) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
    }
}
