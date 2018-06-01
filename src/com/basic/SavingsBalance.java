package com.basic;

public class SavingsBalance {
public static int annualInterestRate;
double savings;
public SavingsBalance(double balance)
{
this.savingsBalance = balance;

}

double savingsBalance;
public void calculateMonthlyInterest()

{
	double interest = (savingsBalance *(annualInterestRate)/12);
			savingsBalance = savingsBalance + interest;
}
public static void modifyInterestRate(int newValue)
{
	annualInterestRate =newValue;
	
	
}
public void showBalance()
{
	System.out.println("balance"+savingsBalance);
}
public static void main(String args [])
{
	SavingsBalance sb1 = new SavingsBalance(2000);
	SavingsBalance sb2 = new SavingsBalance(5000);
	SavingsBalance.modifyInterestRate(4);
	sb1.showBalance();
	sb2.showBalance();
	sb1.calculateMonthlyInterest();
	sb2.calculateMonthlyInterest();
	sb1.showBalance();
	sb2.showBalance();
	SavingsBalance.modifyInterestRate(5);
	sb1.calculateMonthlyInterest();
	sb2.calculateMonthlyInterest();
	sb1.showBalance();
	sb2.showBalance();
}
}
