package com.hs.s1;

import java.util.Scanner;

public class Var_3 {
	
	//main 메소드 생성
	//특수한 메소드 - app 실행
	
	public static void main(String [] args) {
		System.out.println("---프로그램 시작---");
		
		//키보드와 연결 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Var_3 테스트 성공");
		
		/**
		 *  나이는 30, 키 180.2, 몸무게 90.3f
		 *  성별 남, 자산 40억
		 *  변수에 대입하고 출력
		 */
	
		int age=0;
		double height=0.0;
		float weight=0.0F;
		char sex=' ';
		long asset=0L;
		String name="name";
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		
		System.out.println("나이를 입력하세요");
		//키보드로부터 입력
		age = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		height = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요");
		weight = sc.nextFloat();
		
		//char는 못받는다
		sex = '남';
		
		System.out.println("자산을 입력하세요");
		asset = sc.nextLong();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
		System.out.println("성별 : "+sex);
		System.out.println("자산 : "+asset);
		
		
		
		System.out.println("Var_3 테스트 종료");
	}
	
	
}
