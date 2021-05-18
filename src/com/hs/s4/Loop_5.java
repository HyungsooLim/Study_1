package com.hs.s4;

import java.util.Scanner;

public class Loop_5 {

	public static void main(String[] args) {
		// 반복문(for, while) 내에서 switch case 사용시
		// break 사용에 주의
		Scanner sc = new Scanner(System.in);
		boolean check = true;

		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default:
				System.out.println("프로그램 종료");
				check=false;
				break; // <-이거 쓰면 끝나지 않음
			}
		}

	}
}
