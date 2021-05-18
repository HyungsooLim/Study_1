package com.hs.s1;

public class Var_1 {
	public static void main(String [] args) {
		System.out.println("실행 테스트 성공");
		//age 10
		//나이를 담을 변수 선언
		//데이터타입 변수명
		int age; //age라는 변수에 정수형 숫자를 담을 예정
				 // = 대입연산자
				 // 우측의 연산 결과를 좌측에 대입
				 // 선언은 한번만 하면 됨
		age = 10; //초기화
		//학점 4.12 데이터
		double point; //변수 선언
		point = 4; //변수 초기화
		
		int num=10; //동시에 변수 선언과 초기화
		int count=0; //변수 선언
		
		////char
		char ch = '값'; // 문자는 앞뒤로 '문자'해야 문자로 인식함
					   // 아니면 변수로 인식함
					   // 딱 한글자만 넣을 수 있음
		
		////논리
		boolean check = true;
		check = false;
		
		
		System.out.println("Count :"+count);
		
		System.out.println("나이 :"+age);
		System.out.println("학점 :"+point);
		System.out.println("문자 :"+ch);
		System.out.println("확인 :"+check);
	}
}
