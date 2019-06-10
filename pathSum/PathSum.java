package com.mirraico.leetcode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        return dfs(root, 0, sum);
    }

    public boolean dfs(TreeNode root, int tempAns, int sum) {

        if (null == root) return false;
        tempAns += root.val;
        if (null == root.left && null == root.right) {
            return tempAns == sum;
        }

        if (dfs(root.left, tempAns, sum) || dfs(root.right, tempAns, sum)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.right.right = new TreeNode(1);
        System.out.println(new Solution().hasPathSum(root, 22));
    }
}
