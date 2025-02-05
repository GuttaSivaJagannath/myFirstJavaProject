package com.tasks;

import java.util.Scanner;

// Q : Avg of all integers

public class Task3 {

	static Scanner scnr = new Scanner(System.in);

	private static double avgOfAllIntegers() {
		System.out.println("Enter the Starting range : ");
		int n1 = scnr.nextInt();
		System.out.println("Enter the Ending range : ");
		int n2 = scnr.nextInt();
		double sum = 0;
		int count = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
			count++;
		}
		double avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {

		Task3 task3 = new Task3();
		double avgOfAllIntegers = task3.avgOfAllIntegers();
		System.out.println("avgOfAllIntegers within the given range : " + avgOfAllIntegers);

	}

}
