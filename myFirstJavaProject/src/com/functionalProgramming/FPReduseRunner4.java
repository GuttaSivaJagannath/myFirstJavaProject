package com.functionalProgramming;

import java.util.List;

public class FPReduseRunner4 {

	public static void main(String[] FPFilterRunner4) {
		List<Integer> numbers = List.of(43, 45, 2552, 45, 345, 643, 4, 65, 7, 4, 3, 76);
		printFPReduse(numbers);
		printNormalSum(numbers);
	}


	private static void printFPReduse(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("FP : " + sum);
	}

	static int sum1 = 0;
	private static void printNormalSum(List<Integer> numbers) {
		for (int sumof : numbers) {
			// the changing of the value of sum is called the "mutations"
			sum1 += sumof; // here the sumValue is changing
		}
		System.out.println("Normal sum : " + sum1);
	}

}
