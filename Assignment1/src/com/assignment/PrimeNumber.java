package com.assignment;

import java.util.Scanner;

public class PrimeNumber {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		sc.close();
		int flag=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=1;
				break;
				
			}
			
		}
		if(flag==1){
			System.out.println(n+" is not a prime");
		}else 
			System.out.println(n+" is a prime");
	} 
}
