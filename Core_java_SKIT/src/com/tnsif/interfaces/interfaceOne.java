package com.tnsif.interfaces;

public interface interfaceOne {
	
	int a=10;
	void sub();
	default void add() {}
	
	//The default access modifier in class is default
	//The default access modifier in interface is public
	
	static void div() {}

}
