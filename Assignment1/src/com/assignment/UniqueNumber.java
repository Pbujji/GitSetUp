package com.assignment;

import java.util.Scanner;

public class UniqueNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array: ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		int count;
		for(int i=1;i<=n;i++){
			 count=0;
			for(int j=0;j<n;j++){
				
				if(arr[j]==i){
					count++;
					
				}
			}	if(count==1){
				
					System.out.println(i+" is unique ");
			}else if(count>1)
				System.out.println(i+" occured "+count);
			
			
		}
	}
}

