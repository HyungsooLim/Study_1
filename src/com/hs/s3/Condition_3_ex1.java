package com.hs.s3;

import java.util.Scanner;

public class Condition_3_ex1 {

	public static void main(String[] args) {
		/*
		 * 국어, 영어, 수학 입력 총점, 평균 계산 평균 90점 이상이면 A 평균 80점 이상이면 B 평균 70점 이상이면 C 평균 60점 이상이면
		 * D 평균 60점 미만이면 F
		 */
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total / 3;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);

		if (avg >= 90) {
			System.out.println("A");
		} else if (avg < 90 && avg >= 80) {
			System.out.println("B");
		} else if (avg < 80 && avg >= 70) {
			System.out.println("C");
		} else if (avg < 70 && avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		System.out.println("---System Shutdown---");

	}

}
