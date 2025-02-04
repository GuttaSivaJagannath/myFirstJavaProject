package com.exceptionHandling;

public class CheckedException9 {

	public static void main(String[] args) {

		// Thread.sleep(5000);

		// the above line will show like "Unhandled exception type
		// InterruptedException".
		// to solve the aboveone we need to throw an Exception or we want to force to
		// handle the exception.

		// Lets start with trying to handle it
		try {
			someOtherMethod();// this method is related to throws
			Thread.sleep(5000);
			System.out.println("Try Block!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// lets try with "throws"
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("InterruptedException time..");
	}

}
