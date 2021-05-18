package com.hs.s3;

import java.util.Scanner;

public class Condition_1_ex1 {
	public static void main(String [] args) {
		/*
		 * 키보드에서 입력(국어, 영어, 수학)
		 * 총점과 평균 계산
		 * 평균이 90점 이상이면 '우수' 출력
		 * 졸업 출력
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int korean=sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int english=sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int mathmatic=sc.nextInt();
		
		int total=korean+english+mathmatic;
		double avr=total/3.0;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avr);
		
		if(avr>=90) {
			System.out.println("우수");
		}
		
		System.out.println("졸업");
		
	}
}
