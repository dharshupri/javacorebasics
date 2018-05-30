package com.basic;

public class cont {
	
	public static void main(String[] args){
		int i;
		int j;
		
	out:	for(i=0;i<=3;i++)
	{
		
	in:		for(j=0;j<=5;j++)
	{
			if(j==1)
			{
				continue out;
			}
			if(j==3)
			{
				continue in;
			}
			System.out.println("i="+i);
	}
	
	}
		
}
}


