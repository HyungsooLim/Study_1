package com.hs.s5;

import java.util.Scanner;

public class Array_ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = { 1, 2, 3, 4, 5 };
		int[] result = new int[ar.length - 1];
		// 지우고 싶은 숫자 입력
		System.out.println("지우고 싶은 숫자 입력");
		int num = sc.nextInt();
		int idx = 0;

		for (int i = 0; i < ar.length; i++) {
			if (num == ar[i]) {
				System.out.println("find");
				continue;
			}
			result[idx] = ar[i];
			idx++;
		}

		ar = result;

		// 최종결과
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

	}

}
