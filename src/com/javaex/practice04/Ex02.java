package com.javaex.practice04;

public class Ex02 {

	public static void main(String[] args) {

		double[] array = new double[3];
		
		array[0] = 1.2;
		array[1] = 3.3;
		array[2] = 6.7;
		
		for(int i = (array.length)-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
	}

}
