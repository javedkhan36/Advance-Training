package com.question2;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[])  
	{    
	 int n1,n2,n3,i,count=13;    
	  
	 Scanner sc=new Scanner(System.in);
	 System.out.println("first number is:");
	 n1 = sc.nextInt();
	 
	 System.out.println("second number is:");
	 n2 = sc.nextInt();
	 
	 System.out.print(n1+" "+n2);   
	 for(i=2;i<count;++i)    
	 {    
	  n3=n1+n2;
	 
	  
	  System.out.print(" "+n3);
	  n1=n2;    
	  n2=n3;    
	 }    
	
	  }


}
