package com.generics;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumberList {

	// UpperBound = Typically used for read operations, ensuring that you can read
	// objects of the specified type or its subclasses from the generic
	static double sumOfNumberList(List<? extends Number> numbers) {
		// here the above "extends" wild card is called UpperBound wild Card
		double sum = 0;
		for (Number number : numbers) {
			sum += number.doubleValue();
			;
		}
		return sum;

	}

	// LowerBound = Typically used for write operations, ensuring that you can add
	// objects of the specified type or its supertypes to the generic object.
	static void addACoupleOfValues(List<? super Number> numbers) {
		// here the above "extends" wild card is called UpperBound wild Card
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1L);
	}

	public static void main(String[] args) {
		// upperbound
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l)));
		System.out.println(sumOfNumberList(List.of(11, 22, 33, 44)));
		System.out.println(sumOfNumberList(List.of(1.0f, 2.0f, 3.0f, 4.0f)));

		// lowerbound
		List lowerBound = new ArrayList<Number>();
		addACoupleOfValues(lowerBound);
		System.out.println(lowerBound);
	}

}
