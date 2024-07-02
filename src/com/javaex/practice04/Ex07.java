package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

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
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		while(true) {
			if(price >= wonArray[0]){
				price = (price-wonArray[0]);
				count1++;
			}else if(price >= wonArray[1]) {
				price = (price-wonArray[1]);
				count2++;
			}else if(price >= wonArray[2]) {
				price = (price-wonArray[2]);
				count3++;
			}else if(price >= wonArray[3]) {
				price = (price - wonArray[3]);
				count4++;
			}else if(price >= wonArray[4]) {
				price = (price-wonArray[4]);
				count5++;
			}else if(price >= wonArray[5]) {
				price = (price-wonArray[5]);
				count6++;
			}else if(price >= wonArray[6]) {
				price = (price-wonArray[6]);
				count7++;
			}else if(price >= wonArray[7]) {
				price = (price-wonArray[7]);
				count8++;
			}else if(price >= wonArray[8]) {
				price = (price-wonArray[8]);
				count9++;
			}else if(price >=wonArray[9]) {
				price = (price-wonArray[9]);
				count10++;
			}else if(price == 0) {
				break;
			}
			
		}
		System.out.println("50000원: " + count1 +"개");
		System.out.println("10000원: " + count2 +"개");
		System.out.println("5000원: " + count3 +"개");
		System.out.println("1000원: " + count4 +"개");
		System.out.println("500원: " + count5 +"개");
		System.out.println("100원: " + count6 +"개");
		System.out.println("50원: " + count7 +"개");
		System.out.println("10원: " + count8 +"개");
		System.out.println("5원: " + count9 +"개");
		System.out.println("1원: " + count10 +"개");
		
	}

}
