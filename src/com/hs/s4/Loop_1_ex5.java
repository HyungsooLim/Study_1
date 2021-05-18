package com.hs.s4;

import java.util.Scanner;

public class Loop_1_ex5 {

	public static void main(String[] args) {

		// 구구단 출력
		// 단수 입력 ex)3
		// 3 * 1 =3
		// 3 * 2 =6
		// ...

		Scanner sc = new Scanner(System.in);
		System.out.println("단수를 입력하세요.");
		int num = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}
}
