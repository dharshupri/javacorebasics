package com.basic;

public class shape {
double side;
	double length;
	double breadth;
	public shape(double side )
	{
		this.side=side;
		
	}
public  shape(double length, double breadth) {
	if(length >0.0 && length <20.0 && breadth >0.0 && breadth <20.0)
	{
	this.length=length;
	this.breadth=breadth;
}
else
	
{
	System.out.println("sorry length should be greater than 0.0 and less than 20.0" );
}
}
public double findAreaofRectangle()
{
	return length*breadth;
}
public static void main(String[] args)
{
shape square = new shape(5.0);
shape rectangle = new shape(5,2);
System.out.println(rectangle.findAreaofRectangle());
}


}
