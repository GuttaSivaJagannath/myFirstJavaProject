package com.tasks;

import java.util.Scanner;

// Q : Employee Object Contains id, name, sal, age. Write a program to fetch the data with constrains - sal>350000 and age<25

public class Task1 {
	String id;
	String name;
	int salary;
	int age;

	public void employee(String id1, String name1, int salary1, int age1) {

		this.id = id1;
		this.name = name1;
		this.salary = salary1;
		this.age = age1;

		if (salary > 350000 && age < 25) {
			System.out.println(
					"The Employee having age< 25 and salary>350000 : " + id1 + " " + name1);
		}

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter id : ");
		String id1 = scnr.next();
		System.out.println("Enter name : ");
		String name1 = scnr.next();
		System.out.println("Enter salary : ");
		int salary1 = scnr.nextInt();
		System.out.println("Enter age : ");
		int age1 = scnr.nextInt();

		Task1 task1 = new Task1();

		try {
			task1.employee(id1, name1, salary1, age1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// task1.employee("SVOZH0744", "SIVAJAGANNATHGUTTA", 200000, 23);
		// task1.employee("Y19CE044", "SIVA", 355000, 24);
		// task1.employee("A92", "DIVYA", 400000, 23);
	}

}
