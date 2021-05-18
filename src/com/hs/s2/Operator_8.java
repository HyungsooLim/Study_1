package com.hs.s2;

import java.util.Scanner;

public class Operator_8 {
	public static void main(String [] args) {
		//삼항연산
		//조건식 ? 조건식이 true일때 실행 : 조건식이 false일때 실행
		Scanner sc = new Scanner(System.in);
		
		//나이가 20살 이상이면 성인, 아니면 미성년
		System.out.println("나이를 입력하세요");
		int age=sc.nextInt();  //키보드로부터 입력 받은 데이터를 age에 대입
		
		String result = age>19?"성년":"미성년";
		
		System.out.println(result);
	}
}
