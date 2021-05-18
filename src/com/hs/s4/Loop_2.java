package com.hs.s4;

public class Loop_2 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {

			if (i % 2 != 0) {
				System.out.println("홀수");
				// continue;
				break;
			}

			System.out.println("i : " + i);
		}

	}
}
