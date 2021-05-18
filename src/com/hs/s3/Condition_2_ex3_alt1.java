package com.hs.s3;

import java.util.Scanner;

public class Condition_2_ex3_alt1 {

	public static void main(String[] args) {

		int id = 1234;
		int pw = 5678;
		int yId = 0;
		int yPw = 0;
		boolean check = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하세요");
		yId = sc.nextInt();

		System.out.println("PW를 입력하세요");
		yPw = sc.nextInt();

		if (yId == 1234 && yPw == 5678) {
			System.out.println("로그인 성공");
			check = true;
		} else {
			System.out.println("로그인 실패");
			check = false;
		}

		if (check) {
			System.out.println("급여를 입력하세요");
			int wage = sc.nextInt();

			System.out.println("정규직은 1번 / 계약직이면 2번을 입력하세요");
			int status = sc.nextInt();

			int finalWage = 0;

			if (status == 1) {
				finalWage = (int) (wage * 0.93);
			} else {
				finalWage = (int) (wage * 0.967);
			}

			System.out.println(finalWage);
		}

		/*
		 * 로그인 성공 시에만 진행하는 코드 한달 급여를 입력
		 */

		/*
		 * 정규직 실급여 계산 고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
		 */

		/*
		 * 계약직 실급여 계산 원천징수 3.3%
		 */
		// 최종 실급여 출력

		System.out.println("---Program Shutdown");
	}

}
