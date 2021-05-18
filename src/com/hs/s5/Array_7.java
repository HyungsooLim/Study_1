package com.hs.s5;

public class Array_7 {

	public static void main(String[] args) {
		
		int[] ar= {10,20,30};
		System.out.println(ar[0]);
		
		int[] ar2= ar; //얕은 복사, 참조 주소 복사
					   //배열을 같은 주소를 보도록 하는것
		
		System.out.println(ar2[0]);
		
		ar2[1]=222;
		
		System.out.println(ar[1]);
		
		ar2=new int[3];
		
		ar2[1]=444;
		
		System.out.println(ar[1]);
		
		//깊은 복사
		for(int i=0;i<ar.length;i++) {
			ar2[i]=ar[i];
		}
		for(int i=0;i<ar.length;i++) {
		System.out.println("ar : "+ar[i]);
		System.out.println("ar2 : "+ar2[i]);
		System.out.println("---------------");
		}
		
		ar2[1]=0;
		System.out.println(ar[1]);
		
		
	}
}
