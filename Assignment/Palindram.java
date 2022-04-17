package com.wipro.Assignment;
import java.util.*;

public class Palindram {
	public static void main(String args[]) {
		int r,n,result=0,number;
		Scanner i=new Scanner(System.in);
		n=i.nextInt();
		number=n;
		while(n>0) {
			r=n%10;
			result=result*10+r;
			n=n/10;
		}
		if(number==result) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a Palindrom");
		}
	}

}
