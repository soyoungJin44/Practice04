package com.javaex.practice04;

import java.util.Scanner;

public class Ex7_1 {
	public static void main(String[] args) {
	
		int[] wonArray = new int[10];
		
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int won = sc.nextInt();
		int count = 0;
		
		
		for(int i = 0; i< wonArray.length; i++) {
			count = won/wonArray[i]; //count값 자체를 변동x 값이 나옴에 따라 값대입
			won = won - (wonArray[i] *count); //받은 금액에서 50000원 부터 순서대로 계산한 값이 들어감 (초기금액)<<안에값이
			System.out.println(wonArray[i] + "원: " + count + "개");
		}
		
		
		
	}
}