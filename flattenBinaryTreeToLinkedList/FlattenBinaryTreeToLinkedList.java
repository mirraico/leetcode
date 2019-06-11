package com.mirraico.leetcode;

public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {

        dfs(root);
    }

    public TreeNode dfs(TreeNode root) {

        if (null == root) {
            return null;
        }

        TreeNode leftLast = dfs(root.left);
        TreeNode rightLast = dfs(root.right);

        if (null == leftLast && null == rightLast) {
            return root;
        }

        if (null != leftLast) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return null != rightLast ? rightLast : leftLast;
    }

    public static void main(String[] args) {
    }
}
