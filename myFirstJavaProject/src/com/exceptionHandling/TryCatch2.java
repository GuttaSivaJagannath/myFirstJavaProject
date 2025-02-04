package com.exceptionHandling;

public class TryCatch2 {

	// A try-catch block in Java is a mechanism to handle exception. The try block
	// contains code that might thrown an exception and the catch block is used to
	// handles the exceptions if it occurs.

	public static void main(String[] args) {

		method1();
		System.out.println("main completed");// here this statement will print because there is a tryCatch
	}

	private static void method1() {
		method2();
		System.out.println("method1 completed");// firstly,this statement will print because there is a tryCatch
	}

	private static void method2() {

		// if an exception is handled, the exception will not visible to the calling
		// methods, so they are continuing the execution for the next lines of the code
		try{
			String str = null;
		System.out.println(str.length());
		}catch(Exception ex) {
			ex.printStackTrace();// it will print what is the exception, because if
									// somebody what to know what is the exception there must be a printing of
									// exeception
		}
	}
}
