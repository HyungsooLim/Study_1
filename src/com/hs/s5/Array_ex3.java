package com.hs.s5;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// 성적관리 프로그램
		// n명의 학생
		// 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균

		// 학생 수 입력
		// 메뉴
		// 1. 학생정보입력
		// -- 학생 수 만큼 이름, 번호, 국어, 영어, 수학 입력
		// -- 번호는 중복 불가
		// -- 총점, 평균(소수점 포함) 자동계산
		// 2. 학생전체정보출력
		// -- 전체 학생의 모든 정보 출력
		// 3. 학생정보검색
		// -- 검색할 학생 번호 입력
		// -- 해당 번호 학생의 정보 출력
		// -- 입력 번호가 없으면 정보 없음을 출력
		// 4. 프로그램종료

		// 학생 수 입력
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		System.out.println("학생 수를 입력하세요");
		inputNum = sc.nextInt();
		int[] studentNums = new int[inputNum];
		String[] studentNames = new String[studentNums.length];
		int[] studentIds = new int[studentNums.length];
		int[] studentKors = new int[studentNums.length];
		int[] studentEngs = new int[studentNums.length];
		int[] studentMaths = new int[studentNums.length];
		int[] studentTotals = new int[studentNums.length];
		double[] studentAvgs = new double[studentNums.length];

		// 메뉴 입력
		boolean check = true;
		while (check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램종료");
			int selectMenu = sc.nextInt();
			switch (selectMenu) {
			case 1:
				for (int i = 0; i < studentNums.length; i++) {
					System.out.println("학생 이름 입력");
					studentNames[i] = sc.next();
					System.out.println("학생 번호 입력");
					studentIds[i] = sc.nextInt();
					System.out.println("국어 점수 입력");
					studentKors[i] = sc.nextInt();
					System.out.println("영어 점수 입력");
					studentEngs[i] = sc.nextInt();
					System.out.println("수학 점수 입력");
					studentMaths[i] = sc.nextInt();
					studentTotals[i] = studentKors[i] + studentEngs[i] + studentMaths[i];
					studentAvgs[i] = studentTotals[i] / 3;
				}
				break;
			case 2:
				for (int i = 0; i < studentNums.length; i++) {
					System.out.println("번호 : " + studentIds[i] + "   이름 : " + studentNames[i]);
					System.out.println(
							"국어 : " + studentKors[i] + "   영어 : " + studentEngs[i] + "   수학 : " + studentMaths[i]);
					System.out.println("총점 : " + studentTotals[i] + "   평균 : " + studentAvgs[i]);
					System.out.println("-------------------");
				}
				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				int search = sc.nextInt();
				for (int i = 0; i < studentNums.length; i++) {
					if (search == studentIds[i]) {
						System.out.println("번호 : " + studentIds[i] + "   이름 : " + studentNames[i]);
						System.out.println(
								"국어 : " + studentKors[i] + "   영어 : " + studentEngs[i] + "   수학 : " + studentMaths[i]);
						System.out.println("총점 : " + studentTotals[i] + "   평균 : " + studentAvgs[i]);
						break;
					} else if (i == studentNums.length) {
						System.out.println("정보 없음");

					}
				}
				break;
			case 4:
				check = false;
				break;
			}// switch 끝

		} // while 메뉴 끝

		System.out.println("---프로그램 종료---");
	}
}
