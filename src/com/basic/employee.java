package com.basic;

public class employee {

	private String name;
	private Double salary;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public static void main(String args[])
	{
		
		
		
		employee e1=new employee();
		e1.setName("name");
		e1.setSalary(20000.0);
		employee e2=new employee();
		e2.setName("name");
		e2.setSalary(30000.0);
		double salarynew = e1.getSalary();
		salarynew=salarynew*1.1;
		System.out.println(e1.getSalary());
	e2.setSalary(salarynew);
		System.out.println(e2.getSalary());
	}	
		
		
	}
