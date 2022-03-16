package com.question2;

public class Array {
	
	 public static void main(String[] args)
	 {
		int[] a = {3,2,4,5,6,7,3,2,3,2,3,4,7,1,2,0,0,0};
	    int result = 0; 
	    int i,sum = 0;
	    float average = 0,total=0;
	    int min = a[0];  
	    
	    System.out.print( "The Array :"); 
	    for ( i = 0; i < a.length; i++)
	    {
		System.out.print( " "+a[i]); 
	    }
	    
	   
	    
	    for ( i = 0; i < a.length-3; i++) 
	    {
	     sum= sum +a[i];
	    //System.out.println("The sum"+sum);
	    }
	    System.out.println();
	    a[15]=sum;
	    System.out.println("The sum from index 0 to 14 is  : "+sum);
	    
	    System.out.print( "The Array :"); 
	    for ( i = 0; i < a.length; i++)
	    {
		System.out.print( " "+a[i]); 
	    }
	    System.out.println();
	    
	    
	    for(i=0; i<a.length; i++)
	    {
	    	total = total + a[i];
	    	average = total / a.length;
	    
	    }
	    a[16]=(int)average;
	    System.out.println("The average is  : "+average);
	    
	    
	    System.out.print( "The Array :"); 
	    for ( i = 0; i < a.length; i++)
	    {
		System.out.print( " "+a[i]); 
	    }
	    System.out.println();
	    
	    
	    
	    
	    
	   
	    for (i = 0; i < a.length; i++) {  
	         
	       if(a[i] <min)  
	           min = a[i];  
	       a[16]=min;
	    }  
	    System.out.println("Smallest element is : " + a[16]); 
	    a[17]=min;
	    

	  }
	}


