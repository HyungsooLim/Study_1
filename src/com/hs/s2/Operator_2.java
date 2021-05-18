package com.hs.s2;

public class Operator_2 {

	public static void main(String [] args) {
		
		//int 4byte
		//long 8byte
		
		//float 4byte
		//double 8byte
		
		long num1 = 20L;
		
		float num2 = 3.2f;
		
		// num1 = num2; -> float가 long으로 자동형변환 예상
		num1 = (long)num2;  // 강제형변환
		// num2 = num1; -> long이 float로 강제형변환 예상
		num2 = num1;		// 자동형변환
		
		int point = 290; 
		
		double avr = (double)point/3;
	
		
		System.out.println(avr);
		
		avr = 10.3;
		
		System.out.println(avr*3); //근사치도 똑같은 값이라 생각함
		
		avr = 1.33333;
		int n = (int)avr;
		
		System.out.println(n); //강제형변환은 값의 변화가 있을 수 있음
		
	}
}
