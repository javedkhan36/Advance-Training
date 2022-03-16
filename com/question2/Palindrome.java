package com.question2;

import java.util.Scanner;

public class Palindrome {
	
	 public static void main(String[] args) {

		    String str, reverse = "" ;
		    
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the string");
		    str=sc.nextLine();
		    
		    int strLength = str.length();
		    System.out.println("Length of the String: "+strLength);

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverse = reverse + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverse.toLowerCase())) {
		      System.out.println(str.toUpperCase() + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str.toUpperCase() + " is not a Palindrome String.");
		    }
		  }


}
