package com.hs.s2;

public class Operator_5 {
	public static void main(String [] args) {
		
		/* 물건의 총 합계금액 : 34560
		 * 현금			: 50000
		 * 잔돈			:15440
		 * 만원	1장
		 * 천원	5장
		 * 백원	4개
		 * 십원	4개
		 */
		
		int totalCost=0;
		int income=0;
		int change=0;
		int man=0;
		int chun=0;
		int baek=0;
		int ship=0;
		
		totalCost=12340;
		income=50000;
		
		change=income-totalCost;
		man=change/10000;
		chun=change%10000/1000;
		baek=change%1000/100;
		ship=change%100/10;
		
		System.out.println("총 금액 : "+totalCost);
		System.out.println("받은 현금 : "+income);
		System.out.println("거스름돈 : "+change);
		System.out.println("만원 : "+man);
		System.out.println("천원 : "+chun);
		System.out.println("백원 : "+baek);
		System.out.println("십원 : "+ship);
		
		
	}
}
