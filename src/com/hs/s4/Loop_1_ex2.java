package com.hs.s4;

import java.util.Scanner;

public class Loop_1_ex2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("0~59초 사이의 값을 입력");
		int second=sc.nextInt();
		
		for(int i=0;i<60;i++) {
			
			System.out.println("i : "+i+"초");
			if(i==second) {
				i=60;
		}
		
	}
}
}
