package com.hs.s4;

import java.util.Scanner;

public class Loop_1 {

	public static void main(String[] args) {

		// 원하는 수만큼 프린트 실행
		// 원하는 수를 입력 받아서

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 수를 입력하세요");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			System.out.println("Hello World");
		}

		for (int i = 1; i < num; i++) {
			System.out.println("Second");
		}

		int i = 0;
		for (i = 0; i < 3; i++) {

		}

		for (i = 0; i < 3; i = i + 5) {

		}

	}

}
