package com.tnsif.interfaces;

public interface Account {
	public static final float accBal = 0;
	float MIN_bal=5000;
	default void deposit(int accNo,float amt) {}
}
