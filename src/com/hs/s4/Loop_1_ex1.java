package com.hs.s4;

public class Loop_1_ex1 {
	// 짝수만 출력
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println("i : " + i);
			}
		}

		for (int i = 0; i < 100; i = i + 2) {
			System.out.println("i : " + i);

		}

	}
}
