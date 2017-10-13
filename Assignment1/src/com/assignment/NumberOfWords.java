package com.assignment;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String s=sc.nextLine();
		sc.close();
		System.out.println("The number of words in a string are "+s.split(" ").length);
	}
}
