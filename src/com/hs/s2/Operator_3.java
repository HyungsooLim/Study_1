package com.hs.s2;

public class Operator_3 {
	public static void main(String [] args) {
		//총점을 담을 변수
		int total = 290;
		
		//평균을 담을 변수
		double avr = 0.0;
		
		//과목 수는 3과목
		
		//최종결과물 소수점 2자리 까지만 출력
		avr = total/3.0; // 값 = 96.6666666666
		
		avr = avr*100;
		int result = (int)avr;
		avr = result/100.0;
		
		
		
		
		
		System.out.println(avr);
		System.out.println(result);
	}
}
