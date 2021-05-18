package com.hs.s2;

import java.util.Scanner;

public class Operator_8_ex1 {
	public static void main(String [] args) {
		/**
		 * 나이를 키보드로부터 입력
		 * 10대냐 아니냐
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		String result=age>9&&age<20?"10대":"10대X";
		
		System.out.println(result);
		
	}
}
