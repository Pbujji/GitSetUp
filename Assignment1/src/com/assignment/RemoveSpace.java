package com.assignment;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string: ");
		String s=sc.nextLine();
		sc.close();
		char[] sArray=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<sArray.length;i++){
			if(sArray[i]!=' '&& sArray[i]!='\t'){
				sb.append(sArray[i]);
			}
		}
		System.out.println(sb);
	}
}
