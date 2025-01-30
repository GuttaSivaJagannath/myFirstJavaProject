package com.functionalProgramming;

import java.util.List;



public class MethodReference18 {

	// for making code more readable we are going to the method reference

	static void StringCount(Integer integer) {
		System.out.println(integer);

	}

	public static void main(String[] args) {

		// Now this is the normal program that which we will prefer more

		System.out.println("General OutPut : ");
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		// Now lets make code readable by using Method Reference
		System.out.println("MethodReference Output : ");
		List.of("Apple", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReference18::StringCount);
		;
	}

}
