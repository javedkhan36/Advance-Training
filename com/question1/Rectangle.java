package com.question1;

import java.util.Scanner;
public class Rectangle {
	  int length,breadth,area,perimeter;
	  
	  public Rectangle()
	    {
	    	length = 0;
	    	breadth= 0;
	    }

	    void input() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter length of rectangle: ");
	        length = sc.nextInt();
	        System.out.print("Enter breadth of rectangle: ");
	        breadth = sc.nextInt();
	    }

	    void calculate() {
	        area = length * breadth;
	        perimeter = 2 * (length + breadth);
	    }
	    
	    void length() {
	    	System.out.println("the given length of the rectangle is:"+length);
	    }
	    
	    void breadth() {
	    	System.out.println("the given breadth of the rectangle is:"+breadth);
	    }

	    void display() {
	        System.out.println("Area of Rectangle = " + area);
	        System.out.println("Perimeter of Rectangle = " + perimeter);
	    }
	    
	    

	   
}
