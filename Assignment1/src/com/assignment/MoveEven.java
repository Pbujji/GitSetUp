package com.assignment;

import java.util.Scanner;

public class MoveEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=sc.nextInt();
		System.out.println("enter the array :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		int temp=0;
		int left=0, right=n-1;
		while(left<right){
			while(arr[left]%2==0 && left<right){
				left++;
			}
			while(arr[right]%2==1 && left<right){
				right--;
			}
			if(left<right){
				 temp=arr[left];
				 arr[left]=arr[right];
				 arr[right]=temp;
				 left++;
				 right--;
			}
		}
		
		System.out.print("Array after move");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
