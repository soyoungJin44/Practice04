package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {

		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = (int) (Math.random() * 45) + 1;

			for (int a = 0; a<nums.length; a++) {
				if(nums[i] == nums[a] && i !=a) {
					nums[i] = (int)(Math.random()*45)+1;
					
				}

			}
		}
			for(int o = 0; o<nums.length; o++) {
				System.out.print(nums[i]);
				System.out.println("");
			}
	}

}
