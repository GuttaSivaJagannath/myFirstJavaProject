package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner3 {

	// in this, any type of methods can implement
	static <X> X doubleValue(X value) {
		return value;
	}

	<X extends List> void dulicate(X list) {
		list.addAll(list);
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	<X extends List> void duplicate1(X value) {

	}

	public static void main(String[] args) {

		String stringValue = doubleValue(new String("siva"));
		Integer intValu = doubleValue(Integer.valueOf(5));
		ArrayList arrayValue = doubleValue(new ArrayList(List.of(1, 2, 3)));

		System.out.println(intValu);
		System.out.println(arrayValue);
		System.out.println(stringValue);

		ArrayList<Integer> numbers = new ArrayList<>(List.of(3, 4, 5));
		duplicate(numbers);
		System.out.println(numbers);
	}

}
