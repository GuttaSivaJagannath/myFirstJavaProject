package com.functionalProgramming;

import java.util.List;

public class FPMapRunnerExercise10 {

	// Exercise - List.of("Apple","Bat","Cat").stream()
	// map all these to lowercase and print them

	public static void main(String[] args) {
		List.of("Apple", "Bat", "Cat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e + " "));
	}

}
