package com.hs.s3;

import java.util.Scanner;

public class Condition_4_ex2 {
	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 점수 받아서 총점, 평균 계산 평균 90이상 A 평균 80이상 B 평균 70이상 C 평균 60이상 D 평균 60미만 F
		 */

		Scanner sc = new Scanner(System.in);

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;

		System.out.println("국어점수 입력");
		kor = sc.nextInt();
		System.out.println("영어점수 입력");
		eng = sc.nextInt();
		System.out.println("수학점수 입력");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total / 3;

		switch (avg / 10) {
		case 10:

		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
