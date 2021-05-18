package com.hs.s4;

import java.util.Scanner;

public class Loop_1_ex4 {

	public static void main(String[] args) {

		// 로그인 틀리면 5번까지 허용
		/*
		 * 추가로 로그인 성공시 은행 업무 시작 print 로그인 다 실패시 은행 방문 요청 print
		 */

		int id = 1234;
		int pw = 5678;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			System.out.println("ID를 입력하세요");
			id = sc.nextInt();
			System.out.println("PW를 입력하세요");
			pw = sc.nextInt();

			if (id == 1234 && pw == 5678) {
				i = 5;
			}

		} // for 끝

		if (id == 1234 && pw == 5678) {
			System.out.println("은행 업무 시작");
		} else if (id != 1234 || pw != 5678) {
			System.out.println("은행 방문 요청");
		}

	}

}
