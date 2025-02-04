package com.exceptionHandling;

public class TryCatch3 {

	public static void main(String[] args) {

		method1();
		System.out.println("main completed");
	}

	private static void method1() {
		method2();
		System.out.println("method1 completed");
	}

	private static void method2() {
		try {
			String str = null;
			System.out.println(str.length());
		}

		// we can have multiplle catch blocks trying to handle specific exceptions.
		// the above code throwing the NullPonterException.
		// if we want to handle NullPointerException differently, we can have a seperate
		// catch block.
		// the most specific of those exceptions is the one that matches.
		// depends on the type of exception, the specific thing will be handled.
		// here the NullPointerException will give first because it is related to the
		// specific exception.

		catch (NullPointerException ex) {
			System.out.println("caught NullPointerException");
			ex.printStackTrace();// it shows, where the exception is occuring
		}

		// catch (Exception ex) {
		// ex.printStackTrace();
		// }
	}

}
