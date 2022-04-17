package com.wipro.Assignment;
import java.util.*;

public class Armstrong {
	public static void main(String args[]) {
		int n,r,res=0;
		Scanner i=new Scanner(System.in);
		n=i.nextInt();
		while(n>0) {
			r=n%10;
			res=res+r*r*r;
			n=n/10;
		}
	   System.out.println(res);
	}

}
