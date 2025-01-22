package com.functionalProgramming;

import java.util.List;
import java.util.Optional;

public class FPOptionaalClass15 {

	public static void main(String[] args) {
		Optional<Integer> n = List.of(23, 45, 67).stream().filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(n.isPresent());// OutPut - false
		System.out.println(n.isEmpty());// OutPut - true
		System.out.println(n); // OutPut - Optional.empty

		// if we want to return zero instead of empty if there is no value, we need to
		// add (orElse(**))
		Integer nOne = List.of(23, 45, 67).stream().filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		System.out.print(nOne); // Output - 0, because there is no even number in the list
	}

}
