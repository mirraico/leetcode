package com.mirraico.leetcode;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int ans = 0;
		int l = 0, r = height.length - 1;
		while(l != r) {
			int tmpAns = (r - l) * (height[l] < height[r] ? height[l] : height[r]);
			if(tmpAns > ans) ans = tmpAns;
			if(height[l] > height[r]) r--;
			else l++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
	}

}
