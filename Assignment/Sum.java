package com.wipro.Assignment;
import java.util.*;

public class Sum {
	public static void main(String args[]) {
		int n,sum=0,r;
		Scanner i=new Scanner(System.in);
		n=i.nextInt();
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
