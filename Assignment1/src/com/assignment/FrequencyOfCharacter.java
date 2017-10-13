package com.assignment;

import java.util.Scanner;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		sc.close();
		int count;
		System.out.println(s.length());
	
		for(char i='a';i<='z';i++){
			count=0;
		  for(int j=0;j<s.length();j++){
			if(s.charAt(j)==i){
				count++;
			}
		  }
		  if(count!=0){
			  System.out.println(i+"="+count);
	
		  }
		}
	}
}
