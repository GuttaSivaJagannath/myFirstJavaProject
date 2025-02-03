package com.exceptionHandling;

//Null Pointer Exception and stackRace

public class ExceptionHandling1 {

	public static void main(String[] args) {

		method1();

		// the next to the exception statement wont execute, for example in this,
		// after the method1 calling, we are writing a printig statement that which will
		// not execute because the exception jump to the head

		System.out.println("main completed");

	}

	private static void method1() {
		method2();
		System.out.println("method1 completed");
	}

	private static void method2() {
		String str = null;
		System.out.println(str.length());// it will give the NullPointer Exception
	}
}

// In output it is showing that stackrace exceptions like main, method1, method2
// all above are exception statements

/*
 * OUTPUT -
 *
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
 * "String.length()" because "str" is null at
 * myFirstJavaProject/com.exceptionHandling.ExceptionHandling1.method2(
 * ExceptionHandling1.java:20) at
 * myFirstJavaProject/com.exceptionHandling.ExceptionHandling1.method1(
 * ExceptionHandling1.java:15) at
 * myFirstJavaProject/com.exceptionHandling.ExceptionHandling1.main(
 * ExceptionHandling1.java:10)
 */
