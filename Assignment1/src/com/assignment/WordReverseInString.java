package com.assignment;

import java.util.Scanner;

public class WordReverseInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String inputString=sc.nextLine();
		sc.close();
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println("The given String is :  "+inputString);
         
        System.out.println("The Reversed String is:   "+reverseString);
         
        
    }
}
