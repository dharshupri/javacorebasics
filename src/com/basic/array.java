package com.basic;

public class array{
	public static void main(String[] args) {
		int arr[]=new int[10];
		int n=356,t,i=0;

while(n>0)
{
	t=n%10;
	arr[i]=t;
	i++;
	
	n=n/10;
}

for(i=0;i<10;i++)
	System.out.println(arr[i]);
}


		
	

}
