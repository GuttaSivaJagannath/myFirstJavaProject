package com.collections;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgrammingAllOver20 {

// Functional Programming is nothing but giving first class status to methods

// Functions is an First class Citizens

// we would want to able to...
//	 1. Store Functions to variables
//	 2. Passing Functions to method (Frequently we use this)
//   3. Returning Functions from method

	public static void main(String[] args) {

//	1.  Now, we are going for the first step that is Storing methods to variables
		Predicate<? super Integer> Evenpredicate = evnExtracted();
		// if we need odd Predicate we can go for it
		Predicate<? super Integer> Oddpredicate = n -> n % 2 == 1;

//  2. this is the second step that we use everytime
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().filter(Evenpredicate).map(n -> n * n)
				.forEach(n -> System.out.println(n));

	}

//  3. this is the third step that which Returning functions from method
	private static Predicate<? super Integer> evnExtracted() {
		return n -> n % 2 == 0;
	}
}
