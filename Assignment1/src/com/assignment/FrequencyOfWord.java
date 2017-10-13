package com.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		String[] strArr=str.split(" ");
		sc.close();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String s:strArr){
			if(hm.containsKey(s))
				hm.replace(s, hm.get(s)+1);
			else
				hm.put(s, 1);
		}
		System.out.println(hm);
	}
}
