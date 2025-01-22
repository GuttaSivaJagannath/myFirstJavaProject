package com.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FPCollectorsExercise13 {

	// Exercise - create a list and filter the max values and min values in the
	// list, and create them into separate lists.

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// for even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(e -> e % 2 == 0)
                                           .collect(Collectors.toList());
		System.out.println("Even numbers: " + evenNumbers);


		// for odd numbers
		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		System.out.println("Odd numbers: " + oddNumbers);
	}

}