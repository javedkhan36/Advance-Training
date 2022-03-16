package com.question1;

import java.util.Scanner;

public class RectangleModify {
	
	int length; 
    int width; 
    int area; 
    int parameter;
    
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
    public RectangleModify()
    {
    	length = 1;
    	width= 1;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = in.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * width;
       
    }
 
     void  perimeterRectangle()
    {
    	 parameter = 2*(length + width);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Parameter of Rectangle = " +parameter);}
       
        }

    
}
