package com.assignment;

import java.util.Scanner;

public class EvenSumPair {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("The pair of even sum are : ");
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int sum=arr[i]+arr[j];
				//System.out.println(sum);
				if(sum%2==0){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}
