package com.exceptionHandling;

//Finally5
import java.util.Scanner;

public class Finally5 {

	// for scanner classes, if scanner is opened(Scanner scnr = new
	// Scanner(System.in)), and if not closed(scnr.close()) for no.of times, it will
	// cause memory problem, a single object like this is not might a problem, if
	// there is 1000 or more piece of code, there will be leakage of the objects

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] numbers = { 1, 2, 3, 4, 5 };
		int number = numbers[5];// this line of code is having exception

		// because of the above exception, the next lines will not execute, so the
		// scanner will not close in this case
		System.out.println("Before Scanner Close");
		scnr.close();
	}

}
