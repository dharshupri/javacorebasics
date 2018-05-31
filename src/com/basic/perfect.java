package com.basic;

public class perfect {
	public boolean isPerfectnumber(int number)
	{
	int sum=0;
	for(int i=1;i<=number;i++)
	{
		if (number% i  ==0)
		{
			sum=sum+i;
		
	
		}}
		if (sum==number)
			return true;
			else
				return false;
		

}
public static void main(String[] args) {
	perfect p=new perfect();
System.out.println("the given number is"+p.isPerfectnumber(8));

}

}