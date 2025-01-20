package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetFunctions {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(2, 23, 345, 67, 98, 7, 6, 5436));
		System.out.println(numbers);
		// floor returns the number less than or equal to the given number
		System.out.println(numbers.floor(23));

		// lower returns the number less than the given number
		System.out.println(numbers.lower(23));

		// ceiling returns the number greater than or equal to the given number
		System.out.println(numbers.ceiling(67));

		// higher returns the number greater than the given number
		System.out.println(numbers.higher(67));

		// if we need the numbers in between the given range
		System.out.println(numbers.subSet(2, 98));

		// the lower limit should be inclusive and the upper limit should be exclusive
		System.out.println(numbers.subSet(2, 6));

		// for example
		System.out.println(numbers.subSet(2, 7));

		// if we want to say greater than equal to and less than equal to including the
		// values given
		System.out.println(numbers.subSet(23, true, 5436, true));

		// if we want to say greater than equal to and less than equal to excluding the
		// values given
		System.out.println(numbers.subSet(23, false, 5436, false));

		// if you need all the numbers up to particular number that you given
		System.out.println(numbers.headSet(400));

		// if you need all the numbers after the particular number that you given
		System.out.println(numbers.tailSet(400));
	}


}
