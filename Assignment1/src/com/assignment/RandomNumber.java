package com.assignment;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		System.out.println("The random numbers are : ");
		Random random=new Random();
		for(int i=0;i<10;i++){
			System.out.println(" "+random.nextInt());
		}
	}
}
