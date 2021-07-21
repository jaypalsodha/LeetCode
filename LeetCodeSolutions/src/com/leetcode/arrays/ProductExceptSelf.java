package com.leetcode.arrays;

public class ProductExceptSelf {
	
	public static void main(String[] args) {
		
	}
	
	public int[] productExceptSelf(int[] nums) {
		
		int n = nums.length;
		int[] result = new int[n];
		int multiplication = 1;
		
		for(int i = 0 ;i < n; ) {
			multiplication *= nums[i];
		}
		
		for(int i = 0 ;i < n; ) {
			result[i] = multiplication / nums[i];
		}
		return result;
	}
}
