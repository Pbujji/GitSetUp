package com.assignment;

import java.util.Scanner;

public class CompareArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter size");
		int m=sc.nextInt();
		int[] arr1=new int[m];
		System.out.println("enter array");
		for(int j=0;j<m;j++){
			arr1[j]=sc.nextInt();
		}
		sc.close();
		System.out.println("the repeating numbers are: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i]==arr1[j]){
					System.out.print(" "+arr[i]);
				}
			}
		}
	}
}
