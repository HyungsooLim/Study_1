package com.hs.s1;

public class Var_2 {
	public static void main(String [] args) {
		System.out.println("Var_2 테스트 성공");
		// 1500 데이터를 long에 대입하고 출력
		long number = 1500;
		number=2;
		
		int num2; //메모리에 4byte를 확보하고 주소의 시작점을 num이라 하자
		num2 = 20; // num2의 주소에서 시작해서 20이란 데이터를 넣어라
		
		
		float f1 = 3.2F;
		double d1 = 3.2;
		
		
		System.out.println("출력값 : "+number);
	}
}
