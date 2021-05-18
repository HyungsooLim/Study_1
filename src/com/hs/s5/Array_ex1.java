package com.hs.s5;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {

		// 5개의 숫자 입력받아서 합계를 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("생성할 배열의 수를 입력하세요");
		int num = 0;
		num = sc.nextInt();

		int[] ar = new int[num];
		int total = 0;

		for (int i = 0; i < ar.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요");
			ar[i] = sc.nextInt();
			// total = total + ar[i];
		}

		for (int i = 0; i < ar.length; i++) {
			total = total + ar[i];
		}

		System.out.println("합계 : " + total);

	}
}
