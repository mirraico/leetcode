package com.mirraico.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, 0, sum, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(TreeNode root, int tempSum, int sum, List<Integer> tempAns, List<List<Integer>> ans) {

        if (null == root) return;
        tempSum += root.val;
        tempAns.add(root.val);
        if (null == root.left && null == root.right) {
            if (tempSum == sum) ans.add(new ArrayList<>(tempAns));
            tempAns.remove(tempAns.size() - 1);
            return;
        }

        dfs(root.left, tempSum, sum, tempAns, ans);
        dfs(root.right, tempSum, sum, tempAns, ans);
        tempAns.remove(tempAns.size() - 1);
    }

    public static void main(String[] args) {
    }
}
