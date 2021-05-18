package com.hs.s5;

public class Array_ex5 {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		int[] ar2 = new int[4];

		// ar 배열을 4칸으로 수정하는 코드 작성
		
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = ar[i];
		}
		
		ar = ar2;

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);// 1, 2, 3, 4만 출력되게
		}
	}
}
