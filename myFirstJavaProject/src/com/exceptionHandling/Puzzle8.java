package com.exceptionHandling;

import java.util.Scanner;

// Q : When is code in finally not executed??

/* Ans : In Java, the code within a finally block is generally executed regardless of whether an exception is thrown or not. However, there are a few rare scenarios where the finally block might not be executed:

1. System.exit(): If the System.exit() method is called in the try or catch block, the JVM will terminate, and the finally block will not be executed.
						try {
	    						System.exit(0);
								}
						finally {
	    						System.out.println("This will not be printed.");
								}
2. Infinite Loop or Thread Termination: If the thread executing the try block is terminated or enters an infinite loop, the finally block will not be executed.


						try {
						    while (true) {
						        // Infinite loop
						    }
						} finally {
						    System.out.println("This will not be printed.");
						}
3. When the code in finally having exception then the next lines after that will not execute.(Go to line 48 in below code)
*/

public class Puzzle8 {

	public static void main(String[] args) {
		Scanner scnr = null;

		try {
			scnr = new Scanner(System.in);
			int[] numbers = { 1, 2, 3, 4, 5 };
			int number = numbers[5];
			System.out.println("Before Scanner Close");
			scnr.close();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			// for example, if line 52 throws an exception then the if block will not
			// execute.
			// A line in finally will not be executed when the lines before it throws an
			// exception.
			System.out.println("Before Scanner Close");
			if (scnr != null) {
				scnr.close();
			}
		}
	}

}
