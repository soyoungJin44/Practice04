package com.javaex.practice04;

public class EX8_1 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j] && i !=j) {
					lotto[i] = (int)(Math.random()*45)+1;
					j = 0;  // 안쓰면 앞에 출력된 값을까지 점검이 안됨.
				}
			}
			System.out.print(lotto[i] + ("   "));
		}
		
	}

}
