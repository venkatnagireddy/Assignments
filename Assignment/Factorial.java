package com.wipro.Assignment;
import java.util.*;

public class Factorial {
	public static void main(String args[]) {
		int n,r=1;
		Scanner i=new Scanner(System.in);
		n=i.nextInt();
		while(n>0) {
			r=r*n;
			n--;
			}
		System.out.println(r);
	}

}
