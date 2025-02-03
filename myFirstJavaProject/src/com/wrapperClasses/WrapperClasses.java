package com.wrapperClasses;

public class WrapperClasses {

	// Wrapper classes provide a way to use primitive data types (int, boolean,
	// etc..) as objects.

	// Sometimes you must use wrapper classes, for example when working with
	// Collection objects, such as ArrayList, where primitive types cannot be used
	// (the list can only store objects):

	// To create a wrapper object, use the wrapper class instead of the primitive
	// type. To get the value, you can just print the object:
	public static void main(String[] args) {
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
	}

}
