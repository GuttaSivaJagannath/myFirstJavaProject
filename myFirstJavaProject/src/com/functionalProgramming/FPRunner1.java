package com.functionalProgramming;

import java.util.List;

public class FPRunner1 {
	int x = 10;

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printBasic(list);
		printWithPF(list);
	}

	public static void printBasic(List<String> list) {
		for (String list1 : list) {
			System.out.println(list1);
		}
		System.out.println(" ");
	}
	private static void printWithPF(List<String> list) {

		// in this, instead of looping the string, we are converting into the stream
		list.stream().forEach(
				element -> System.out.println("element : " + element)
		);
		// above line is the "action", it is the function
		// we are sending the function code to forEach
		// *we know function is the first class citizen*
		// in this we are sending function as a parameter to another function
		// above ( -> ) is the lamda Expressiion
		// lamda expression is nothing but shortcut for creating a function
		}

}


