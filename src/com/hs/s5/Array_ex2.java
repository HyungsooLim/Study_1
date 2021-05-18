package com.hs.s5;

import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {

//		학생 수 입력 학생 수 만큼 이름을 입력 
//		1.입력이 끝나면 학생 이름 출력
//		학생의 수만큼 학생의 학번 입력
//		~~학생의 번호를 입력
//		2.출력 -> 이름 : ~  번호 : ~
//		3.국,영수, 점수 입력
//		4. 이름 : ~   번호 : ~  국어 : ~  영어 : ~

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int studentNum = sc.nextInt();
		String[] studentName = new String[studentNum];
		int[] studentId = new int[studentName.length];
		int[] studentKor = new int[studentName.length];
		int[] studentEng = new int[studentName.length];
		int[] studentMath = new int[studentName.length];

		for (int i = 0; i < studentName.length; i++) {
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요");
			studentName[i] = sc.next();
			System.out.println(studentName[i] + "학생의 학번을 입력하세요");
			studentId[i] = sc.nextInt();
			System.out.println(studentName[i] + "학생의 국어 점수 입력");
			studentKor[i] = sc.nextInt();
			System.out.println(studentName[i] + "학생의 영어 점수 입력");
			studentEng[i] = sc.nextInt();
			System.out.println(studentName[i] + "학생의 수학 점수 입력");
			studentMath[i] = sc.nextInt();
		}

		for (int i = 0; i < studentName.length; i++) {
			System.out.println("이름 : " + studentName[i]);
			System.out.println("학번 : " + studentId[i]);
			System.out.println("국어 : " + studentKor[i] + "   영어 : " + studentEng[i] + "   수학 : " + studentMath[i]);
		}

	}
}
