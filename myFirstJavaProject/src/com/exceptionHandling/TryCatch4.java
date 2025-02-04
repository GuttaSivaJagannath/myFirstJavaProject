package com.exceptionHandling;

public class TryCatch4 {

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
			int[] i = { 1, 2, 3, 4 };
			int number = i[4];
		}

		// here we have NullPointerException in catch block, it wont takes this
		// exception, because it is not related to the specific one.

		catch (NullPointerException ex) {
			System.out.println("caught NullPointerException");
			ex.printStackTrace();
		}

		// now we are going to write the specific catch block which is related to the
		// exception that occuring in this.

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
			ex.printStackTrace();// it shows where the exception is occuring
		}

		// after writing the specific catch block like above, we no need to write this
		// catch block.

		// catch (Exception ex) {
		// ex.printStackTrace();
		// }
	}

}
