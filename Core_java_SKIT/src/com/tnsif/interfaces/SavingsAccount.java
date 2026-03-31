package com.tnsif.interfaces;

public class SavingsAccount implements Account
{	
	void deposit(float accNo,float amt)
	{
		float bal=accNo.getBal();
		accNo.bal=accNo.bal+amt;
	}
}
