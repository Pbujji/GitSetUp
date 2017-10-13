package com.assignment;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if(a>b && a>c){
			System.out.println("The number a = "+a+"is large number ");
		}else if(b>c){
			System.out.println("The number b = "+b+" is large number");
		}else 
			System.out.println("The number c = "+c+ " is large number");
	}
}
