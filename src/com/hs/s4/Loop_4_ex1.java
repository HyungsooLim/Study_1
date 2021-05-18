package com.hs.s4;

import java.util.Scanner;

public class Loop_4_ex1 {

	public static void main(String[] args) {
		// 로그인 횟수 무제한 입력받기
		// 성공하면 종료
		// 1. 로그인
		// 2. 종료
		int id = 1234;
		int pw = 5678;
		Scanner sc = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.println("1. 로그인");
			System.out.println("2. 프로그램 종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("ID 입력");
				int inputId = sc.nextInt();
				System.out.println("PW 입력");
				int inputPw = sc.nextInt();
				if (id == inputId && pw == inputPw) {
					System.out.println("로그인 성공");
					break;
				} else if (id != inputId || pw != inputPw) {
					System.out.println("로그인 실패");
				}
			} else if (select == 2) {
				break;
			}
		} // while 끝
		System.out.println("프로그램 종료");
	}
}
