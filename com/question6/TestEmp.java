package com.question6;

import java.util.Vector;

public class TestEmp {
	
	public static void main(String[]args) {
		Vector<Employee> v=addInput();
		display(v);
	}
	public static Vector<Employee> addInput(){
		Employee e1=new Employee(11,"jk","Mumbai");
		Employee e2=new Employee(12,"mak","Delhi");
		Employee e3=new Employee(13,"jak","Kolkata");
		Employee e4=new Employee(14,"ak","gujrat");
		Vector<Employee>v = new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		return v;



	}
	public static void display(Vector<Employee>v)
	{
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}

}
