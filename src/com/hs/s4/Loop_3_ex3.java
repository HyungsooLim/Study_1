package com.hs.s4;

import java.util.Scanner;

public class Loop_3_ex3 {

	public static void main(String[] args) {
		// 캐릭터 탄창 3개 지급
		// 탄창 1개당 총알 30개
		// 단발?, 점사? 결정
		// 단발 선택시 탕 출력문이 30
		// 점사 선택시 타타탕 출력문 10
		int single = 0;
		int burst = 0;
		Scanner sc = new Scanner(System.in);

		for (int mag = 1; mag < 4; mag++) {
			System.out.println("격발 모드를 입력");
			System.out.println("1. 단발" + "  " + "2. 점사");
			int shot = sc.nextInt();
			if (shot == 1) {
				for (single = 0; single < 30; single++) {
					System.out.println(single+".탕");
				}

			} else {
				for (burst = 0; burst < 10; burst++) {
					System.out.println(burst+".타타탕");
				}
			}
		}

	}
}
