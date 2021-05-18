package com.hs.s2;

import java.util.Scanner;

public class Operator_7 {
	public static void main(String [] args) {
		
		int num1 = 20;
		int num2 = 10;
		boolean check = num1 > num2;
		
		check = num1 != num2;
		
		check = num1 < num2; //false
		
		boolean check1 = true;
		boolean result = check1 && check;
		result = check1 || check;
		boolean result1 = !result;
		
		System.out.println(check);
		System.out.println(result);
		System.out.println(result1);
		
		// == -> primitive 타입만 가능
		int n1 = 10;
		int n2 = 10;
		result = n1 == n2;
		
		double d1 = 10.0;
		result = n1 == d1;
		
		char ch = '1';
		n1 = 49;
		result = n1 == ch;
		
		String str = "49"; //reference type이어서 안됨
		//result = n1 == str;
		
		String str2 = "49";
		result = str == str2; //true
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		str2 = sc.next(); // 문자열 입력 받기
		
		result = str == str2; //false
							  // 문자열 끼리 ==는 쓰지 말것
		
		
		System.out.println(result);
		
	}
}
