package com.collections;

import java.util.TreeMap;

public class MapRunnerNavigableKeys {

	public static void main(String[] args) {
		// Navigable keys
		TreeMap<Character, Integer> characters = new TreeMap<>();
		characters.put('A', 1);
		characters.put('C', 3);
		characters.put('K', 14);
		characters.put('L', 3254);
		characters.put('W', 453);
		characters.put('I', 4367897);
		characters.put('T', 22);
		System.out.println(characters);
		// {A=1, C=3, I=4367897, K=14, L=3254,, T=22, W=453}

		// the higherKey represents the next value that present
		System.out.println(characters.higherKey('C'));
		// if you give the unknown character it will go for the next character in the
		// sorting order
		System.out.println(characters.higherKey('S'));

		// ceilingKey Represents the greater than or equal to the number
		System.out.println(characters.ceilingKey('F'));

		// lowerKey Represents the lower order of the given value
		System.out.println(characters.lowerKey('D'));

		// floorKey represents the lessThanOrEqual the the value given
		System.out.println(characters.floorKey('N'));

		System.out.println(characters.firstEntry());
		System.out.println(characters.lastEntry());
		System.out.println(characters);

		// subMap will give in between the given values inclusive at left side and
		// exclusive at right side
		System.out.println(characters.subMap('A', 'W'));

		// if we want to include the last value, we wan to use these step
		System.out.println(characters.subMap('A', true, 'W', true));
	}

}
