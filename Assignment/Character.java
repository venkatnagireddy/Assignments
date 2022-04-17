package com.wipro.Assignment;
import java.util.*;
import java.lang.*;

public class Character {
	public static void main(String args[]) {
		char n;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the character");
		n=i.next().charAt(0);
		if(n =='a' || n=='e' || n=='i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' || n=='O' || n=='U') {
			System.out.println(n+ " is vowel");
			
		}
		else if(n>='a' && n<='z' || n>='A' && n<='Z') {
			System.out.println(n+ " is consonant");
		}
		else if(n>=0 && n<=9){
			System.out.println(n+" is number");
		}
		else {
			System.out.println(n +" is special character");
		}
	}

}
