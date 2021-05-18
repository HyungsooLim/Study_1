package com.hs.s5;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 하나의 변수로 여러개의 데이터
		int age = 20;
		int age2 = 23;
		int age3 = 30;

		// 배열 선언
		int[] ages;

		// 배열 생성
		ages = new int[3];

		int[] ages2 = new int[3];

		int[] ages3 = { 20, 23, 30 };

		System.out.println(ages3[0]);
		System.out.println(ages3[2]);

		System.out.println("인덱스 번호 입력");
		int index = sc.nextInt();

		System.out.println(ages3[index]);

	}
}
