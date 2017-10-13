package com.assignment;

public class Swap {
	public static void main(String[] args) {
		int a=10,b=20;
		int temp;
		System.out.println("before swap the value of a is "+a+" the value of b is "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap the value of a is " +a+" the value of b is "+b);
		//with out third variable
		int first=10,second=20;
		first=first*second;
		second=first/second;
		first=first/second;
		System.out.println("after swap the value of a is " +first+" the value of b is "+second);
	}
}
