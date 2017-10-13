package com.assignment;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		if(n%2==0){
			System.out.println("n = "+n+" is even");
		}else
			System.out.println("n = "+n+" is odd");
		
	}
}
