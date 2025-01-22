package com.functionalProgramming;

import java.util.List;

public class FPMapRunnerExercise11 {

	// Exercise - List.of("Apple","Bat","Cat").stream()
	// print the length of each element

	public static void main(String[] args) {
		List.of("Apple", "Bat", "Cat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
		;
	}

}
