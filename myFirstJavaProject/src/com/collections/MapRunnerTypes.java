package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapRunnerTypes {

	public static void main(String[] args) {

		// HashMap does'nt take the insertion order or sorting order, it gives the random output
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("DK", 192);
		hashMap.put("SJN", 44);
		hashMap.put("DKSJN", 19244);
		System.out.println(hashMap);

		// LinkedHashMap gives the insertion Order
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("DK", 12);
		linkedHashMap.put("SJN", 25);
		linkedHashMap.put("DKSJN", 1225);
		System.out.println(linkedHashMap);

		// TreeMap gives the Sorting order
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("SJN", 25);
		treeMap.put("DK", 12);
		treeMap.put("DKSJN", 1225);
		System.out.println(treeMap);
	}

}
