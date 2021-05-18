package com.hs.s3;

import java.util.Scanner;

public class Condition_2_ex2 {

	public static void main(String[] args) {

		int id = 1234;
		int pw = 5678;
		int yId = 0;
		int yPw = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하세요");
		yId = sc.nextInt();

		System.out.println("PW를 입력하세요");
		yPw = sc.nextInt();

		if (yId == 1234 && yPw == 5678) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
