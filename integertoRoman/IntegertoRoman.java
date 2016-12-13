package com.mirraico.leetcode;

public class IntegertoRoman {

	public String intToRoman(int num) {
        String one[] = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String ten[] = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundred[] = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousand[] = new String[] {"", "M", "MM", "MMM"};
        String ans;
        ans = one[num % 10];
        if((num = num / 10) == 0) {
        	return ans;
        }
        ans = ten[num % 10] + ans;
        if((num = num / 10) == 0) {
        	return ans;
        }
        ans = hundred[num % 10] + ans;
        if((num = num / 10) == 0) {
        	return ans;
        }
        ans = thousand[num % 10] + ans;
        
        return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().intToRoman(11));
	}

}
