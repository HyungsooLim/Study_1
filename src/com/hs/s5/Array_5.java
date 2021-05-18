package com.hs.s5;

public class Array_5 {

	public static void main(String[] args) {
		int[] ar1 = new int[3];

		int[] ar2 = new int[3];

		// ar1[0] == 0
		// ar2[0] == 0

		// Stack ar들 속에 담기는건 주소지만 주소가 서로 다름
		System.out.println(ar1 == ar2);
		System.out.println(ar1);
		System.out.println(ar2);

		ar1 = ar2;
		System.out.println(ar1 == ar2);
	}
}
