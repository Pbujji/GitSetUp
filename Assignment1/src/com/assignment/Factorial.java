package com.assignment;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		sc.close();
		int fact=1;
		while(n!=0){
			fact=fact*n;
			n--;
		}
		System.out.println("the factorial of a number is "+fact);
		
	}

}
