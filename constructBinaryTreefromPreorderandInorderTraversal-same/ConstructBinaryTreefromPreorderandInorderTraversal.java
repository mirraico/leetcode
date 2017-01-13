package com.mirraico.leetcode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	
	public TreeNode build(int[] preorder, int[] inorder, int pos, int l, int r) {
		if(pos >= preorder.length || l >= r) return null;
		TreeNode root = new TreeNode(preorder[pos]);
		int mid = 0;
		for(int i = r - 1; i >= l; i--) {
			if(inorder[i] == preorder[pos]) {
				mid = i;
				break;
			}
		}
		root.left = this.build(preorder, inorder, pos + 1, l, mid);
		root.right = this.build(preorder, inorder, pos + mid - l + 1, mid + 1, r);
		
		return root;
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return this.build(preorder, inorder, 0, 0, inorder.length);
	}
	
	public static void main(String[] args) {
		int[] preorder = {1, 2, 3};
		int[] inorder = {1, 2, 3};
		new Solution().buildTree(preorder, inorder);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}