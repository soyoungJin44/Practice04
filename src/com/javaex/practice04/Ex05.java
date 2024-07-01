package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			result = result + nums[i]; //+= nums[i];
		}
		System.out.println("평균은 " + (result/5) + "입니다.");
		
		sc.close();
		
	}

}
