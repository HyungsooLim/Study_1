package com.hs.s4;

import java.util.Scanner;

public class Loop_1_ex4_alt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id = 1234;
		int pw = 5678;
		int check = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("ID 입력");
			int yId = sc.nextInt();
			System.out.println("PW 입력");
			int yPw = sc.nextInt();

			if (yId == id && yPw == pw) {
				System.out.println("로그인 성공");
				check = 1;
				break;
			} else {
				System.out.println("로그인 실패");
			}
		} // for 끝

		if (check == 1) {
			System.out.println("은행 업무 시작");
		} else {
			System.out.println("은행 방문 요청");
		}

		System.out.println("---프로그램 종료---");

	}
}
