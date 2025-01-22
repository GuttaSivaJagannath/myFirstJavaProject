package com.functionalProgramming;

import java.util.List;

public class FPReduseRunner6 {

	public static void main(String[] args) {
		// in lamda experssion we can write a multiple lines of code as well by using
		// braces
		List<Integer> rollNo = List.of(2,4,5,6,7,8,5,3,2,5,6,7,8,8,8,5,3,2,1,4,67);

//		int oddNum = rollNo.stream().filter(number -> number % 2 == 1).reduce(0,
//				(number1, number2) -> number1 + number2);
//		System.out.println(oddNum);

		// above code is the lamda expression with single line

		// now we are writing with multiple lines with the braces
		FPReduce(rollNo);
	}

	private static int FPReduce(List<Integer> rollNo) {
		return rollNo.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
			});
	}

}
