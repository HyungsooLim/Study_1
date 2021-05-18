package com.hs.s5;

import java.util.Scanner;

public class Array_ex3_answer1 {

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
		// 4. 최우수 학생 출력(평균이 제일 높은 학생 출력)
		// 5. 프로그램종료

		// 학생 수 입력
		Scanner sc = new Scanner(System.in);
		String[] names = null;
		int[] nums = null;
		int[] kors = null;
		int[] engs = null;
		int[] maths = null;
		int[] totals = null;
		double[] avgs = null;
		String[] delete = null;

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();
		names = new String[num];
		nums = new int[names.length];
		kors = new int[names.length];
		engs = new int[names.length];
		maths = new int[names.length];
		totals = new int[names.length];
		avgs = new double[names.length];

		boolean check = true;

		while (check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 최우수 학생 출력");
			System.out.println("5. 학생검색삭제");
			System.out.println("6. 학생정보추가");
			System.out.println("7. 프로그램종료");
			num = sc.nextInt();

			switch (num) {
			case 1:
				for (int i = 0; i < names.length; i++) {
					System.out.println(i + 1 + "번째 학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + " 학생 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(names[i] + "국어 점수 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i] + "영어 점수 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i] + "수학 점수 입력");
					maths[i] = sc.nextInt();

					totals[i] = kors[i] + engs[i] + maths[i];
					avgs[i] = totals[i] / 3.0;
				}
				break;

			case 2:
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				for (int i = 0; i < names.length; i++) {
					System.out.print(names[i] + "\t");
					System.out.print(nums[i] + "\t");
					System.out.print(kors[i] + "\t");
					System.out.print(engs[i] + "\t");
					System.out.print(maths[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.println(avgs[i] + "\t");
					System.out.println("------------------------------------------");
				}
				break;

			case 3:
				System.out.println("검색할 학생 번호 입력");
				num = sc.nextInt();
				for (int i = 0; i < names.length; i++) {
					if (num == nums[i]) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
						System.out.print(names[i] + "\t");
						System.out.print(nums[i] + "\t");
						System.out.print(kors[i] + "\t");
						System.out.print(engs[i] + "\t");
						System.out.print(maths[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.println(avgs[i] + "\t");
						System.out.println("------------------------------------------");
						check = false;
						break;
					}
				} // for 끝
				if (check) {
					System.out.println("해당 번호의 학생정보 없음");
				}
				check = true;
				break;

			case 4:
				// 제일 높은 평균을 담을 임시 변수
				double top = avgs[0];
				// 제일 높은 평균을 가지는 학생의 index번호
				int idx = 0;
				for (int i = 1; i < names.length; i++) {
					if (top < avgs[i]) {
						top = avgs[i];
						idx = i;
					}
				}
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				System.out.print(names[idx] + "\t");
				System.out.print(nums[idx] + "\t");
				System.out.print(kors[idx] + "\t");
				System.out.print(engs[idx] + "\t");
				System.out.print(maths[idx] + "\t");
				System.out.print(totals[idx] + "\t");
				System.out.println(avgs[idx] + "\t");
				System.out.println("------------------------------------------");

//				int i=0;
//				for(i=1;i<names.length;i++) {
//					if(avgs[i-1]>=avgs[i]) {
//						avgs[i-1]=avgs[i];
//					}else if(avgs[i-1]<=avgs[i]) {
//						break;
//					}
//				}
//				System.out.print("최우수학생 : "+names[i]+"\t");
//				System.out.print("평균점수 : "+avgs[i]);
				break;

			case 5:
				delete = new String[names.length - 1];
				int[] delete2 = new int[names.length - 1];
				int[] delete3 = new int[names.length - 1];
				int[] delete4 = new int[names.length - 1];
				int[] delete5 = new int[names.length - 1];
				int[] delete6 = new int[names.length - 1];
				double[] delete7 = new double[names.length - 1];
				if (names.length < 1) {
					System.out.println("학생이 0명입니다.");
					continue;
				}

				int idx2 = 0;
				System.out.println("삭제하고 싶은 학생 번호 입력");
				num = sc.nextInt();

				for (int i = 0; i < names.length; i++) {
					if (num == nums[i]) {
						System.out.println("번호 검색 완료");
						continue;
					}
					delete[idx2] = names[i];
					delete2[idx2] = nums[i];
					delete3[idx2] = kors[i];
					delete4[idx2] = engs[i];
					delete5[idx2] = maths[i];
					delete6[idx2] = totals[i];
					delete7[idx2] = avgs[i];
					idx2++;
				}
				names = delete;
				nums = delete2;
				kors = delete3;
				engs = delete4;
				maths = delete5;
				totals = delete6;
				avgs = delete7;

				for (int i = 0; i < names.length; i++) {
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
					System.out.print(names[i] + "\t");
					System.out.print(nums[i] + "\t");
					System.out.print(kors[i] + "\t");
					System.out.print(engs[i] + "\t");
					System.out.print(maths[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.println(avgs[i] + "\t");
					System.out.println("------------------------------------------");
				}
				break;

			case 6:
				String[] addNames = new String[names.length + 1];
				int[] addNums = new int[addNames.length];
				int[] addKors = new int[addNames.length];
				int[] addEngs = new int[addNames.length];
				int[] addMaths = new int[addNames.length];
				int[] addTotals = new int[addNames.length];
				double[] addAvgs = new double[addNames.length];
				int idx3 = 0;
				for (int i = 0; i < names.length; i++) {
					addNames[i] = names[i];
					addNums[i] = nums[i];
					addKors[i] = kors[i];
					addEngs[i] = engs[i];
					addMaths[i] = maths[i];
					addTotals[i] = totals[i];
					addAvgs[i] = avgs[i];
				}

				System.out.println("학생 이름 입력");
				addNames[names.length] = sc.next(); // names[addNames.length-1]도 가능
				System.out.println("학생 번호 입력");
				addNums[names.length] = sc.nextInt();
				System.out.println("국어 점수 입력");
				addKors[names.length] = sc.nextInt();
				System.out.println("영어 점수 입력");
				addEngs[names.length] = sc.nextInt();
				System.out.println("수학 점수 입력");
				addMaths[names.length] = sc.nextInt();
				addTotals[names.length] = addKors[names.length] + addEngs[names.length] + addMaths[names.length];
				addAvgs[names.length] = addTotals[names.length] / 3.0;
				names = addNames;
				nums = addNums;
				kors = addKors;
				engs = addEngs;
				maths = addMaths;
				totals = addTotals;
				avgs = addAvgs;
				break;

			case 7:
				System.out.println("프로그램 종료 코드");
				check = false;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		} // while 끝

		System.out.println("---프로그램 종료---");
	}

}
