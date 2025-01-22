package com.functionalProgramming;

import java.util.List;

public class FPSortedStream8 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 343, 6, 76, 547, 65, 12, 862, 17, 76, 90, 6);

		// this is called the sorting
		// sorting is known as it will sort the list
		System.out.println("Sorting : ");
		numbers.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println();

		// this is called the distinct
		// distict is known as, it will not allows the duplicate values in list
		System.out.println("Distinct : ");
		numbers.stream().sorted().distinct().forEach(e -> System.out.println(e));

	}

}
