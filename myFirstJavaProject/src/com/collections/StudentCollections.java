package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollections {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(44, "Siva"), new Student(192, "Divya"), new Student(0, "DS"));
		ArrayList<Student> studentAl = new ArrayList<>(students);
		Collections.sort(studentAl);
		System.out.println("Descending order : " + studentAl);
		// Collections.sort(studentAl, new AscendingOrderStudent()); ( OR )
		studentAl.sort(new AscendingOrderStudent());
		System.out.println("Ascending order : " + studentAl);
	}

}
