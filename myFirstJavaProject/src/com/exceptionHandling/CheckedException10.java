package com.exceptionHandling;

public class CheckedException10 {

	// lets try with another example by throwing RuntimeException
	private static void someOtherMethod2() throws RuntimeException {
		System.out.println("RuntimeException time..");
	}

	// this is "throws" InterruptedException
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("InterruptedException time..");
	}

	public static void main(String[] args) {

		// now if we call someOtherMethod2() method, it wont show any error message even
		// though we are not handling this by using try catch as in before
		// Class(CheckedException9) program.

		someOtherMethod2();

		// if we call someOtherMethod(), it will shows error because it is not handled
		// as in the before class(CheckedException9).
		// sometimes this type of exception will force you to handle it by using try
		// catch block or by using throws

		// someOtherMethod();

		// the reason is because that we want to know from the next class.... Go to the
		// next class
		// now the question is which type of exception we want to force to handle it and
		// which type of exceptions we want to ignore
	}

}
