package com.assignment;

import java.util.Scanner;

public class DigitToString {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter String : ");
		int number=sc.nextInt();
		sc.close();
		 int reverseN = 0;
		      while(number != 0){
		          reverseN = (reverseN*10)+(number%10);
		          number = number/10;
		      }
		     
		int remainder=0;
		while(reverseN!=0){
			remainder=reverseN%10;
			if(remainder==1){
				System.out.print("One ");
			}else if(remainder==2){
				System.out.print("Two ");
			}else if(remainder==3){
				System.out.print("Three ");
			}else if(remainder==4){
				System.out.print("Four ");
			}else if(remainder==5){
				System.out.print("Five ");
			}else if(remainder==6){
				System.out.print("Six ");
			}else if(remainder==7){
				System.out.print("Seven ");
			}else if(remainder==8){
				System.out.print("Eight ");
			}else if(remainder==9){
				System.out.print("Nine ");
			}else 
				System.out.print("Zero ");
		reverseN=reverseN/10;	
		}
		
		
	    
	  }
	  
	}


