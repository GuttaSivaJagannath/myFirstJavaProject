package com.tasks;

import java.util.Scanner;

// Q : sum of all integers

public class Task2 {

	static Scanner scnr = new Scanner(System.in);

	private static int sumOfAllIntegers() {
		System.out.println("Enter the Starting range : ");
		int n1 = scnr.nextInt();
		System.out.println("Enter the Ending range : ");
		int n2 = scnr.nextInt();
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Task2 task2 = new Task2();
		int sumOfAllIntegers = task2.sumOfAllIntegers();
		System.out.println("sumOfAllIntegers within the given range : " + sumOfAllIntegers);

	}

}
