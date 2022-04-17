package com.wipro.Assignment;
import java.util.*;

public class Fibonacci {
	public static void main(String args[]) {
		int a=0,b=1,n,result;
		Scanner j=new Scanner(System.in);
		System.out.println("Enter the terms requied for");
		n=j.nextInt();
		if(a==0) {
		System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		//how many terms
		for(int i=0;i<=n-2;i++) {
			result=a+b;
			a=b;
			b=result;
			System.out.println(result);
			
		}
		
	}

}
