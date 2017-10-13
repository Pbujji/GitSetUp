package com.assignment;

public class LargestNumber {
	public static void main(String[] args) {
		int a,b,c;
		a=10;b=20;c=30;
		if(a>b && a>c){
			System.out.println("The number a = "+a+"is large number ");
		}else if(b>c){
			System.out.println("The number b = "+b+" is large number");
		}else 
			System.out.println("The number c = "+c+ " is large number");
	
		int small,big;
		if(a>b){
			big=a;
			small=b;
		}else {
			big = b; 
			small = a;
		
		}
		
		if (big > c)
		{
			System.out.println("biggest = " + big);
			if (c>small) {
				System.out.println("second biggest ="+ c);
				System.out.println("third biggest =" + small);
			} else {
				System.out.println("second biggest ="+ small);
				System.out.println("third biggest =" + c);
			}
		} else { 
			
			System.out.println("biggest = " + c);
			System.out.println("second biggest ="+ big);
			System.out.println("third biggest =" + small);

		}

			
		
	
	}
	
}
