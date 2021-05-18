package com.hs.s2;

public class Operator_4 {
	public static void main(String [] args) {
		
		/* 연산자를 이용해 식 만들기
		 * 0		->		0
		 * 1		->		1
		 * 2		->		2
		 * 3		->		3
		 * 4		->		4
		 * 5		->		11
		 * 6		->		12
		 * 7		->		13
		 * 8		->		20
		 * 9		->		21
		 * 10		->		22
		 */
		
		int input=0;
		int output=0;
		
		input=5;
		output=input/4*10+input%4;
		//output=input/4*6+input;
		
		System.out.println("입력값 : "+input);
		System.out.println("출력값 : "+output);
	}
}
