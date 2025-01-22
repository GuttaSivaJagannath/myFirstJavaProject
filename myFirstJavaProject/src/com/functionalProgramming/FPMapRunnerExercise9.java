package com.functionalProgramming;

import java.util.stream.IntStream;

public class FPMapRunnerExercise9 {

	// Exercise - Print squares of first 10 numbers!
	// clue - IntStream.range(1,10)
	// Intstream.range(a,b), in this the b is exclusive not inclusive
	public static void main(String[] args) {

		// if we mention 1,10 here, the output will be only up to 1 to 9
		IntStream.range(1, 10).forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();

		// if we mention 1,11 here, the output will be 1 to 10
		IntStream.range(1, 11).forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();

		// now we can do squares of the numbers
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}

}
