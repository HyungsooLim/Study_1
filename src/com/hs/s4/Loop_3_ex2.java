package com.hs.s4;

import java.util.Scanner;

public class Loop_3_ex2 {

	public static void main(String[] args) {
		// 0시 0분
		// 0시 1분
		// ...
		// 0시 59분
		// 1시 0분
		// 24시간

		// 시와 분을 입력
		// 입력받은 시간이 되면 즉시 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("시를 입력하세요");
		int inputHour = sc.nextInt();
		System.out.println("분을 입력하세요");
		int inputMinute = sc.nextInt();
		boolean check = false;

		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				System.out.println(hour + "시 " + minute + "분");
				if (hour == inputHour && minute == inputMinute) {
					check = true;
					break;
				}
				if (check) {
					break;
				}
			}

			System.out.println("프로그램 종료");
		}
	}
}
