package com.functionalProgramming;

import java.util.List;
import java.util.Optional;

public class FPMaxCompare12 {

	public static void main(String[] args) {

		// Optional takes place because in output there might be a result or may not.
		// In this case, java8 invented the term "Optional" instead of giving "Null"

		Optional<Integer> maxValue = List.of(12, 34, 54, 12, 66, 89, 76, 34, 66).stream()
				.max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(maxValue);// Output - Optional[89]


		// in this case we can check weather the value is present or not, by using
		// isPresent() method, that which it gives the boolean expression wheather its
		// true or not
		// Optional is presenting because if there is no value to give output, it will
		// give empty

		boolean maxValue1 = List.of(12, 34, 54, 12, 66, 89, 76, 34, 66).stream()
				.max((n1, n2) -> Integer.compare(n1, n2)).isPresent();
		System.out.println(maxValue1);// Output - true


		// in this case, if it is true, we can use the get() method to give the maxValue
		// in the list without presenting Optional

		Integer maxValue2 = List.of(12, 34, 54, 12, 66, 89, 76, 34, 66).stream()
				.max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(maxValue2);// Output - 89

	}

}
