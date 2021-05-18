package com.hs.s3;

import java.util.Scanner;

public class Condition_4_ex1 {
	public static void main(String[] args) {
		/*
		 * 1. 회원가입 2. 로그인 3. 공지사항 4. 프로그램 종료 번호를 입력 회원가입 진행코드 출력 로그인 진행코드 출력 공지사항 진행코드
		 * 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 공지사항");
		System.out.println("4. 프로그램 종료");

		System.out.println("번호를 입력");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			System.out.println("회원가입 진행코드");
			break;
		case 2:
			System.out.println("로그인 진행코드");
			break;
		case 3:
			System.out.println("공지사항 진행코드");
			break;
		default:
			System.out.println("---프로그램 종료---");
		}

	}

}
