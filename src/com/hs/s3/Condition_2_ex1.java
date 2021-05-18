package com.hs.s3;

import java.util.Scanner;

public class Condition_2_ex1 {

	public static void main(String[] args) {

		// 국어, 영어, 수학 입력
		// 총점, 평균 계산
		// 평균이 60점 이상이면 합격
		// 아니면 불합격

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		boolean check = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		kor = sc.nextInt();

		System.out.println("영어 점수를 입력하세요.");
		eng = sc.nextInt();

		System.out.println("수학 점수를 입력하세요.");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total / 3;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		if (avg >= 60) {
			check = true;
		} else {
			check = false;
		}

		// 40점 미만이면 불합격 1과목이라도
		if (kor < 40) {
			check = false;
		}

		if (eng < 40) {
			check = false;
		}

		if (math < 40) {
			check = false;
		}

		if (check) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
