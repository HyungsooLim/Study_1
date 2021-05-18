package com.hs.s2;

public class Operator_9 {
	public static void main(String [] args) {
		
		int count=1;
		
		System.out.println(count);
		
		count=count+1;
		System.out.println(count);
		
		count=count+1;
		System.out.println(count);
		
		int num=1;
		System.out.println("num : "+num);
		
		++num; //num=num+1;
		System.out.println("num : "+num);
		
		--num; //num=num-1;
		System.out.println("num : "+num);
		
		num++; // num=num+1;
		System.out.println("num : "+num);
		
		num--;
		System.out.println("num : "+num);
		
		num=1;
		count=++num;
		//num=num+1;  ->  count=num;
		System.out.println("---------------------");
		System.out.println("count : "+count);
		System.out.println("num : "+num);
		
		num=1;
		count=1;
		count=num++;
		//count=num;  ->  num=num+1;
		
		System.out.println("---------------------");
		System.out.println("count : "+count);
		System.out.println("num : "+num);
		
		num=1;
		count=1;
		count=1+num++;
		System.out.println("---------------------");
		System.out.println("count : "+count); 
		System.out.println("num : "+num);	  
		
		num=1;
		System.out.println("---------------------");
		System.out.println(num++); // print를 먼저하고 +1하라
		System.out.println(num);   // 위에서 1증가시킨걸 print
		
		num=1;
		num=++num+num+num++;
		System.out.println("---------------------");
		System.out.println(num);
		
		
		
	}
}
