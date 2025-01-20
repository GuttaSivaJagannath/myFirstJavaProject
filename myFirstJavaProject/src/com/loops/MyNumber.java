package com.loops;

public class MyNumber {

	public Object printANumberTriangle;
	int count = 0;

	public void isPrime(int n1) {
		// it has two factors,those are 1 divisible by its self
		for (int a = 1; a <= n1; a++) {
			if (n1 % a == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("given number is a prime number");
		} else {
			System.out.println("given number i not a prime number");
		}

	}

	int sum = 0;

	public void sumUptoN(int n2) {
		for (int b = 1; b <= n2; b++) {
			sum = sum + b;
		}
		System.out.println("sumUptoN = " + sum);

	}
	int sum1 = 0;

	public void sumOfDivisors(int n3) {
		for (int a3 = 1; a3 <= n3 - 1; a3++) {
			if (n3 % a3 == 0) {
				sum1 = sum1 + a3;
			}
		}
		System.out.println("Sum Of Divisors except given integer = " + sum1);
	}

	public void printANumberTriangle(int n4) {
		for (int a4 = 1; a4 <= n4; a4++) {
			for (int a5 = 1; a5 <= a4; a5++) {
				System.out.print(a5 + " ");
			}
			System.out.println();
		}
	}

}
