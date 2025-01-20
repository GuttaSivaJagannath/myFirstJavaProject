package com.functionalProgramming;

import java.util.List;

public class FPRunner2 {

	public static void main(String[] args) {
		// printing the numbers by using streams
		List<Number> list = List.of(1, 2, 3, 4);
		list.stream().forEach(
				element -> System.out.println(element)
				);
	}

}
