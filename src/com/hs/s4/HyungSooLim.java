package com.hs.s4;

import java.util.Scanner;

public class HyungSooLim {

	public static void main(String[] args) {
		// 로그인 과정은 Loop_4_ex1 가져와서
		// 로그인 코드와 게임 코드 분리
		int id = 1234;
		int pw = 5678;
//		
//		 rpg 게임
//		 Lv.1 -> Lv.15
//		 모든 몬스터는 경험치가 같다.
//		 lv.1 -> lv.2 : 3마리
//		 lv.2 -> lv.3 : 6마리
//		 lv.3 -> lv.4 : 9마리
//		 lv.4 -> lv.5 : 12마리
//		 ...
//		 lv.14 -> lv.15 : 42마리
//		 
//		 ex) 1 -> 2
//		 몬스터 1마리 사냥
//		 몬스터 2마리 사냥
//		 몬스터 3마리 사냥
//		 레벨업 출력
//		 2 -> 3
//		 몬스터 1마리 사냥
//		 ...
//		 
//		 보상으로 Gold - 기본은 0으로 시작
//		 레벨이 5가되면 1000Gold 지급
//		 레벨이 10이되면 2000Gold 지급
//		 레벨이 15가되면 3000Gold 지급
//		 최종 Gold 출력
//		 
//		 레벨업 찍고 다음 레벨 가기 전 게임 계속 유무를 지정
//		 종료 할때 현재 레벨과 Gold 출력
//		 
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int gold = 0;
		int lv = 1;

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
					System.out.println("게임 시작");
					break;
				} else if (id != inputId || pw != inputPw) {
					System.out.println("로그인 실패");
				}
			} else if (select == 2) {
				lv=16;
				break;
			}
		} // 로그인 완료
			// --------게임 시작-----//

		for (;lv < 16; lv++) {
			for (int num = 1; num <= lv * 3; num++) {
				System.out.println("잡은 몬스터 수 : " + num);
			}
			System.out.println("---레벨업---");
			System.out.println("현재 레벨 : " + (lv + 1));

			if ((lv + 1) % 5 == 0) {
				gold = gold + (lv + 1) / 5 * 1000;
				System.out.println("현재 골드 : " + gold);
			}

			if (lv < 14) {
				System.out.println("1. 게임을 계속한다.");
				System.out.println("2. 게임을 종료한다.");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					break;
				case 2:
					System.out.println("현재 레벨 : " + (lv + 1));
					System.out.println("현재 골드 : " + gold);
					lv=16;
				}
			} else if (lv == 14) {
				break;
			}

		}
		System.out.println("-------프로그램 종료--------");
	}
}
