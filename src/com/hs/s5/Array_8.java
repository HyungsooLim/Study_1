package com.hs.s5;

public class Array_8 {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3 };

		int[] ar2 = { 4, 5, 6 };

		// 같은 데이터타입을 묶음
		// 이중 배열
		// 배열 안에 배열, 배열을 모은 배열
		// new[전체배열을 모을 갯수][각 배열의 크기];
		int[][] ars = new int[2][3];
		ars[0] = ar;
		ars[1] = ar2;

		System.out.println(ars[0][0]);
		System.out.println(ars[1][1]);

		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < ars[j].length; i++) {
				System.out.println(ars[j][i]);
			}
		}

	}
}
