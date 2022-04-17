package com.wipro.Assignment;
import java.util.*;

public class Prime {
	public static void main(String args[]) {
		int n,count=0;
		Scanner i=new Scanner(System.in);
		n=i.nextInt();
		for(int j=2;j<n;j++) {
			if(n%j==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}

}
