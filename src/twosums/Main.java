package twosums;

import java.util.Scanner;

public class Main {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				int val = nums[i] + nums[j];
				if (val == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
	}	
}

