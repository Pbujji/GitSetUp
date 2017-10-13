package com.assignment;

import java.util.Scanner;

public class OddNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array :");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.println("enter the array elements:");
		for(int i=0;i<len;i++){
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		System.out.print("The odd numbers from a given array are : ");
		for(int i=0;i<len;i++){
			
			if(arr[i]%2!=0){
				System.out.print("  "+arr[i]);
			}
		}
	}
}
