package com.hs.s5;

import java.util.Scanner;

public class Array_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//이차원배열 가변배열
		int [][] ars = new int [2][];
		
		ars[0]=new int[3];
		ars[1]=new int[2];
		
		for(int i=0;i<ars.length;i++) {
			for(int j=0;j<ars[i].length;j++) {
				System.out.println("입력");
				ars[i][j]=sc.nextInt();
			}
		}
		
		
	}
}
