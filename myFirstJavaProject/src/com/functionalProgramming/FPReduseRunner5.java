package com.functionalProgramming;

import java.util.List;

//sum of all odd numbers in the list

public class FPReduseRunner5 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(78, 33, 74, 65, 74, 46, 25, 75, 33, 6, 6, 7, 7, 8, 8, 43);
		int oddSum = numbers.stream().filter(number -> number % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);
		System.out.print(oddSum);

	}
}
