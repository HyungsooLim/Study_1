package com.hs.s4;

import java.util.Scanner;

public class Loop_3_ex3_alt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 단발");
		System.out.println("2. 점사");
		int select = sc.nextInt();
		int count = 10;
		String sound = "타타탕";

		if (select == 1) {
			count = 30;
			sound = "탕";
		}

		for (int b = 0; b < count; b++) {
			System.out.println(sound);
		}

	}
}
