package com.hs.s2;

import java.util.Scanner;

public class Operator_8_ex2 {
	public static void main(String [] args) {
		/**
		 * 물건의 구입가격 입력
		 * 물건의 가격이 30000 이상이면 5%할인
		 * 아니면 3%할인
		 * 택배비 2500원
		 * 최종출력은 물건의 최종가격과 택배비가 포함된 최종가격
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("구입 가격을 입력하세요");
		
		int price=sc.nextInt();
		
		int result= price>=30000?(int)(price*0.95):(int)(price*0.97);
	
		System.out.println("할인된 가격 : "+(result));
		System.out.println("택배비 포함 가격 : "+(result+2500));
	}
}
