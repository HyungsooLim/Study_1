package com.hs.s3;

import java.util.Scanner;

public class Condition_3_ex2 {
	public static void main(String[] args) {
		/*
		 * 1.짜장면 - 5000원 2.라면 - 3000원 3.햄버거 - 8000원 4.피자 - 10000원
		 * 
		 * 인원수 입력
		 * 
		 * 최종 출력 : 총 주문 금액
		 */
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int count = 0;
		int price = 0;

		System.out.println("1. 짜장면");
		System.out.println("2. 라면");
		System.out.println("3. 햄버거");
		System.out.println("4. 피자");
		menu = sc.nextInt();
		System.out.println("인원수 입력");
		count = sc.nextInt();

		if (menu == 1) {
			price = 5000;
		} else if (menu == 2) {
			price = 3000;
		} else if (menu == 3) {
			price = 8000;
		} else {
			price = 10000;
		}
		// 최종 주문 금액 출력
		System.out.println(price * count);

	}

}
