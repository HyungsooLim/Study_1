package com.hs.s2;

public class Operator_10 {
	public static void main(String [] args) {
		
		int a=3;
		int b=2;
		int c= a<<b;
		
		System.out.println(c);
		
		
		a=5;
		c=a>>b;
		System.out.println(c);
		
		a=-5;
		c=a>>b;
		System.out.println(c);
		
		a=-5;
		c=a>>>b;
		System.out.println(c);
		
		a=23;
		c=15;
		int result= a & c;
		result= a|c;
		System.out.println(result);
		
		result= ~a;
		System.out.println(result);
		
		
	}
}
