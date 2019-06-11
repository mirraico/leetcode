package com.mirraico.leetcode;

public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {

        if (null == root) return null;
        dfs(root.left, root.right);
        return root;
    }

    public void dfs(Node left, Node right) {

        if (null == left || null == right) {
            return;
        }

        left.next = right;
        dfs(left.left, left.right);
        dfs(right.left, right.right);
        dfs(left.right, right.left);
    }

    public static void main(String[] args) {
    }
}
