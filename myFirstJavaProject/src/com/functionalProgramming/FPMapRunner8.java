package com.functionalProgramming;

import java.util.List;

public class FPMapRunner8 {
// The map () operation is used to transform each element of a stream into another object using a given function
	public static void main(String[] args) {
		List<Integer> number = List.of(14, 67, 98, 34, 56, 0, 1, 1, 2, 4, 3, 2, 4, 3, 0, 9, 88, 77, 77, 88);
		// before mapping the elements
		System.out.println("Before mapping the elements : ");
		number.stream().distinct().sorted().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		System.out.println("After Mapping with square of element : ");
		number.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}

}
