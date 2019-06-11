package com.mirraico.leetcode;

import java.util.LinkedList;

public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {

        if (null == root) return null;

        LinkedList<Node> list = new LinkedList<>();
        list.addLast(root);
        int levelNum = 1;
        while (!list.isEmpty()) {

            Node node = list.removeFirst();
            if (null != node.left) list.addLast(node.left);
            if (null != node.right) list.addLast(node.right);

            if (--levelNum != 0) {
                node.next = list.getFirst();
            } else {
                node.next = null;
                levelNum = list.size();
            }
        }

        return root;
    }

    public static void main(String[] args) {
    }
}
