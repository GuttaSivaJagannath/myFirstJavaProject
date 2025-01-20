package com.collections;

import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		Map<String, Integer> studentRollNo = Map.of("Siva", 25, "DK", 12, "DkSj", 1225);

		// to get the specific value, we can do by this "get"
		System.out.println(studentRollNo.get("Siva"));
		System.out.println(studentRollNo.get("DK"));
		System.out.println(studentRollNo.get("DkSj"));
		System.out.println(studentRollNo.get("GDS"));

		// if you want size of the map, then we can find by this
		System.out.println("Size : " + studentRollNo.size());

		// if you want the specific "Key" that which present
		System.out.println("containsKey DK : " + studentRollNo.containsKey("DK"));

		//if you want the specific "value" that which is present
		System.out.println("containsValue 12 : " + studentRollNo.containsValue(12));
		System.out.println("containsValue 44 : " + studentRollNo.containsValue(44));

		// we can check is the list is empty or not
		System.out.println("Map isEmpty : " + studentRollNo.isEmpty());

		// all the keys present
		System.out.println(studentRollNo.keySet());

		// all the values present
		System.out.println(studentRollNo.values());

		System.out.println(studentRollNo);

	}

}
