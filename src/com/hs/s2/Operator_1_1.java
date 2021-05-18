package com.hs.s2;

public class Operator_1_1 {
	public static void main(String [] args) {
		//형변환
		int num1 = 10;
		long num2 = 20L;
		
		// int -> long, long -> int
		num2 = num1; //자동형변환
		
		num1 = (int)num2; //강제형변환
		
		num1 = 10;
		num2 = 20L;
		
		long num3 = num1+num2; //큰거 따라 자동형변환되서 연산 가능
		
		int num4 = num1+(int)num2; // int num4 = (int)(num1+num2);도 가능
		
		System.out.println(num3);
		System.out.println(num4);
		
	}
	
	
	
}
