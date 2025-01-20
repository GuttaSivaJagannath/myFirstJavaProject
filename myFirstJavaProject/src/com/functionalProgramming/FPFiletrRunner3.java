package com.functionalProgramming;

import java.util.List;

public class FPFiletrRunner3 {
	public static void main(String[] FPRunner3) {
		List<String> list = List.of("Cat", "Apple", "Bat", "Dog", "Rat");
		printBasicFiletering(list);
		printWithFPFilter(list);

		List<Integer> numbers = List.of(1, 3, 4, 6, 12, 8, 9, 22, 33, 56, 7, 8);
		printBasicFileteringNumbers(numbers);
		printWithFPFilterNumbers(numbers);

	}

	private static void printBasicFiletering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printBasicFileteringNumbers(List<Integer> list) {
		for (int number : list) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}
	}

	private static void printWithFPFilter(List<String> list) {
		list.stream()
		.filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("Element - " + element));
	}

	private static void printWithFPFilterNumbers(List<Integer> list) {
		list.stream()
				.filter(digit -> digit % 2 == 1)
		.forEach(digit -> System.out.println("digit - " + digit));
	}
}
