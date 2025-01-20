package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		Set<Character> Characters = Set.of('A', 'C', 'B', 'Z', 'Y', 'E');
		/*
		 * Unique - Set Tree LikedHashSet Hash
		 */

		// for tree set it will be given sorted output
		Set<Character> treeSet = new TreeSet<>(Characters);
		System.out.println("TreeSet : " + treeSet);

		// for LinkedHashSet the order will be based on insertion
		Set<Character> linkedHashSet = new LinkedHashSet<>(Characters);
		System.out.println("LinkedHashSet : " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(Characters);
		System.out.println("hashSet : " + hashSet);
	}

}
