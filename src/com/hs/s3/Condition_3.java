package com.hs.s3;

import java.util.Scanner;

public class Condition_3 {
	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("답을 입력하세요");
		num = sc.nextInt();

		if (num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		} else {
			System.out.println("5번");
		}

	}

}
