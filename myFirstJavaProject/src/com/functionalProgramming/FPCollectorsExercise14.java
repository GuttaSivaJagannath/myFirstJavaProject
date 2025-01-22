package com.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPCollectorsExercise14 {

	public static void main(String[] args) {

		// Exercise - now we want to create the list for squares of first 10 integers


		// the below line indicates the IntStream, which will not allow to convert to
		// the List
		System.out.println("Normal OutPut :");
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));

		System.out.println();

		// if we want to convert the IntStream to stream, we want to use the boxed()
		IntStream.range(1, 11).map(e -> e * e).boxed();

		System.out.println();

		// now we can use the collectors to convert to the list
		System.out.println("Listed OutPut :");
		List<Integer> numberList = IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
		System.out.println(numberList);
	}

}
