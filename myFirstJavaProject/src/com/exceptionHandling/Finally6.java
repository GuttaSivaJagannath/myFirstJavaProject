package com.exceptionHandling;

import java.util.Scanner;

//finally6
public class Finally6 {

	// to overcome the problrms like before Class(Finally5), now are going to solve
	// by using finally

	public static void main(String[] args) {
		Scanner scnr = null;

		try {
			scnr = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[5];

			// even we are writing in try block, the next lines after exception in the
			// specific block is not executing, but we must want to close the scanner object

			System.out.println("Before Scanner Close");
			scnr.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// even there is an exception in the above code, we can close the scanner object
		// by using the finally block
		// this finally will exceute even there is an exception or there is no exception

		finally {
			System.out.println("Before Scanner Close");
			if (scnr != null) {
			scnr.close();
			}
		}

		// this line will execute because we are writing the exception code in try block
		// and handling by using the catch block.

		System.out.println("Just Before closing the main");
	}

}
