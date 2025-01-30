package com.functionalProgramming;

import java.util.List;

public class MethodReference19 {

	// Exercise - write the code to find the maximum even number of the given list

	public static void main(String[] args) {

		// now first we write the normal form that which we used to write

		// output before using method reference
		System.out.println("Before method reference Code: ");
		int max = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		System.out.println(max);

		System.out.println();


		// now we are going for the MethodReference
		System.out.println("After method reference Code: ");
		int max1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(MethodReference19::IsEven)
				.max(Integer::compare).orElse(0);
		;// to compare which is the max
		System.out.println(max1);

	}

	static boolean IsEven(Integer number) {
		return number % 2 == 0;

	}

}
