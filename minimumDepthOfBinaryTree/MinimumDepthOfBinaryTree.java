package com.mirraico.leetcode;

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {

        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int level) {

        if (null == root) {
            return level;
        }

        int left = dfs(root.left, level + 1);
        int right = dfs(root.right, level + 1);

        if (null == root.left || null == root.right) {
            return null == root.left ? right : left;
        }

        return Math.min(left, right);
    }

    public static void main(String[] args) {
    }
}
