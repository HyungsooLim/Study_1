package com.hs.s4;

import java.util.Scanner;

public class Loop_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check = true;

		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("회원가입 코드 실행");
			} else if (select == 2) {
				System.out.println("로그인 코드 실행");
			} else {
				break;
			}
		} // while 끝
		System.out.println("프로그램 종료");
	}
}
