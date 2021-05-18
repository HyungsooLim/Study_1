package com.hs.s5;

public class Array_3 {

	public static void main(String[] args) {
		
		int [] ar= new int[3];
		double [] ar2= new double[2];
		
		ar[0]= 20;
		ar[1]=30;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println(ar2[1]);
		
		//문자 4개를 담을 배열을 선언하고 
		//각 칸에 A~D까지 대입
		//각 칸을 출력
		
		String [] alphabet = new String[4];
		alphabet[0]="A";
		alphabet[1]="B";
		alphabet[2]="C";
		alphabet[3]="D";
		
		System.out.println("----------------------");
		System.out.println(alphabet);
		System.out.println(alphabet[0]);
		System.out.println(alphabet[1]);
		System.out.println(alphabet[2]);
		System.out.println(alphabet[3]);
		
		for(int i=0;i<4;i++) {
			System.out.println(alphabet[i]);
			
		}
		
		
	}
}
