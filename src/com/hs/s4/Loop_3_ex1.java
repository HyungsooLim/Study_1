package com.hs.s4;

public class Loop_3_ex1 {

	public static void main(String[] args) {

		for (int i = 2; i < 4; i++) {

			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}

			for (int k = 1; k < 10; k++) {
				System.out.println(i + " * " + k + " = " + i * k);
			}
		}

	}
}
