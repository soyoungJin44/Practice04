package com.javaex.practice04;

public class Ex8_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		
		for(int i = 0; i <arr.length; i++) {
			
				arr[i] = (int)(Math.random()*45)+1;
				
				for(int j = 0; j< i; j++) {
					if(arr[i] == arr[j]) { //앞쪽까지 점검이 안되서 배열 위치가 다르면 값 체크를 못함.
						i--;
						break;
						
					}
				}
				System.out.print(arr[i] + "    ");
		}
	}

}
