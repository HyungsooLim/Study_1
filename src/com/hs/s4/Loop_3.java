package com.hs.s4;

public class Loop_3 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			System.out.println("i : "+i);
			for(int j=0;j<2;j++) {
				System.out.println(j + " inner for");
			}
			
			
			System.out.println("바깥 for의 끝");
		}
		
	}
}
