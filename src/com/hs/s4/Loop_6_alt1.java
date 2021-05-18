package com.hs.s4;

import java.util.Scanner;

public class Loop_6_alt1 {

	public static void main(String[] args) {

		int id = 1234;
		int pw = 5678;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int level = 0;
		int gold = 0;
		int select = 0;

		while (check) {
			System.out.println("1. 로그인");
			System.out.println("2. 프로그램 종료");
			select = sc.nextInt();

			if (select == 1) {
				System.out.println("ID를 입력하세요");
				int yId = sc.nextInt();
				System.out.println("PW를 입력하세요");
				int yPw = sc.nextInt();

				if (yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				check = false;
			}
		}
		// ---------------게임 부분-------------------
		if (check) {
			System.out.println("게임 진행");

			for (level = 1; level < 15; level++) {
				System.out.println("1. 사냥 시작");
				System.out.println("2. 게임 종료");
				select = sc.nextInt();

				if (select == 1) {

					for (int mon = 0; mon < level * 3; mon++) {
						System.out.println("몬스터 :" + (mon + 1) + "마리 사냥 성공");
					}
					System.out.println("레벨업" + (level + 1));

					if ((level + 1) % 5 == 0) {
						System.out.println((level + 1) / 5 * 1000 + "GOLD 지급");
						gold = gold + (level + 1) / 5 * 1000;
					}
				} else {
					System.out.println("게임을 종료 합니다.");
					break;
				}

			} // 레벨업 for 끝

			System.out.println("최종 레벨 : " + level);
			System.out.println("최종 골드 : " + gold);
		}

		System.out.println("---프로그램 종료---");
	}
}
