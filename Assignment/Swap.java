package com.wipro.Assignment;
import java.util.*;

public class Swap {
	public static void main(String args[]) {
		int n,m,temp;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter number n");
		n=i.nextInt();
		Scanner j=new Scanner(System.in);
		System.out.println("Enter number m");
		m=j.nextInt();
		n=n+m;
		m=n-m;
		n=n-m;
		//Another method
		temp=n;
		n=m;
		m=temp;
		System.out.println(n);
		System.out.println(m);
		}

}
