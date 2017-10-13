package com.assignment;

import java.util.Scanner;

public class PalindromeOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String : ");
		String str=sc.next();
		System.out.println("enter number: ");
		int n=sc.nextInt();
		sc.close();
		
		//String palindrome
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse = reverse + str.charAt(i);
			
		}
		if(str.equals(reverse)){
			System.out.println(str+" is a palindrome");
		}else 
			System.out.println(str+" not palindrome");
		
		//Number palindrome
		int temp=n;
		int reverseN = 0;
	      while(n != 0){
	          reverseN = (reverseN*10)+(n%10);
	          n = n/10;
	         
	      }
	    System.out.println(reverseN);
	      if(temp==reverseN){
	    	  System.out.println(temp+" is a palindrome");
	      }else
	    	  System.out.println(temp+" not palindrome");
	}
}
