package com.wipro.Assignment;

import java.util.Scanner;

public class Evenodd {
	public void main(String args[]) {
		int n;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter number");
		n=i.nextInt();
		if(n%2==0) {
			System.out.println(n+" is odd number");
		}
		else {
			System.out.println(n+" is even number");
		}
	}

}
