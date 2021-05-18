package com.hs.s4;

import java.util.Scanner;

public class Loop_1_ex3 {
	public static void main(String[] args) {

		/*
		 * 입력받는 코드를 반복문안에 구성
		 * 누적함수를 써서 총점 구하기
		 * 반복문 종료 후 최종 총점 출력
		 */

		Scanner sc=new Scanner(System.in);
		int score=0;
		int total=0;
		int n=0;

		System.out.println("과목수를 입력하세요");
		n=sc.nextInt();

		for(int i=0;i<n;i++) {
			System.out.println(i+1+"번째 점수를 입력하세요");
			score=sc.nextInt();
			total=total+score;
		}

		System.out.println("총점 : "+total);




	}
}
