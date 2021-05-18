package com.hs.s3;

import java.util.Scanner;

public class Condition_1_ex2 {
	public static void main(String [] args) {
		/**
		 * 키보드 입력
		 * 국어, 영어, 수학 입력 받아서 총점과 평균 계산
		 * 평균 90점 이상이면 A 출력
		 * 평균 80점 이상이면 B 출력
		 * 평균 70점 이상이면 C 출력
		 * 평균 60점 이상이면 D 출력
		 * 평균 60점 미만이면 F 출력
		 */
		Scanner sc=new Scanner(System.in);
		
		int korean=0;
		int english=0;
		int mathmatic=0;
		int total=0;
		double avg=0.0;
		
		System.out.println("국어 점수를 입력하세요");
		korean=sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		english=sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		mathmatic=sc.nextInt();
		
		total=korean+english+mathmatic;
		avg=total/3;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		if(avg>=90) {
			System.out.println("학점 : A");
		}
		
		if(avg<90&&avg>=80) {
			System.out.println("학점 : B");
		}
		
		if(avg<80&&avg>=70) {
			System.out.println("학점 : C");
		}
		
		if(avg<70&&avg>=60) {
			System.out.println("학점 : D");
		}
		
		if(avg<60) {
			System.out.println("학점 : F");
		}
		
		System.out.println("---Program Shutdown---");
	}
}
