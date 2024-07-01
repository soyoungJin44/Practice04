package com.javaex.practice04;

public class Ex06 {

	public static void main(String[] args) {

		char[] letter = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','1'};
		
		for(int i=0; i<letter.length;i++) {
			
			if(letter[i] == ' ') {
				letter[i] = ',';
			}
			System.out.print(letter[i]);
			
		}
		
	}

}
