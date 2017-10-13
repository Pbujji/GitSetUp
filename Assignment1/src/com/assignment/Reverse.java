package com.assignment;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		sc.close();
		int rem,result=0;
		while(n!=0){
			rem=n%10;
			result=(result*10)+rem;
			n=n/10;
			
		}
		System.out.println(result);
	}
}
