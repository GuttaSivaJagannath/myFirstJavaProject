package com.exceptionHandling;

import java.util.Scanner;

public class TryWithResource16 {

	public static void main(String[] args) {

		/*
		 * now we are writing the normal way of program that which we are handling the
		 * exception by using the try catch and finally to close the scnr.
		 *
		 *
		 * Scanner scnr = null; try { scnr = new Scanner(System.in); int[] numbers = {
		 * 1, 2, 3, 4, 5 }; int number = numbers[5]; } catch
		 * (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("caught ArrayIndexOutOfBoundsException");
		 * e.printStackTrace(); }
		 *
		 * catch (Exception e) { e.printStackTrace(); }
		 *
		 * finally { System.out.println("Before Scanner Close"); if (scnr != null) {
		 * scnr.close(); } }
		 *
		 */

		// now we are going for TryWithResource, we are handling it by try method only
		// TryWithResource is a specific thing, we dont need any catch or finally in
		// this, if you want a catch block, we can write it.
		// the triWithResource will automatically calls the scnr.close(); at the end of
		// the execution

		try (Scanner scnr = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[5];
			System.out.println(number);
		}
	}

}
