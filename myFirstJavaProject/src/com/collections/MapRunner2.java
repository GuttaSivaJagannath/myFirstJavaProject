package com.collections;

import java.util.HashMap;
import java.util.Map;

// to know the how many no of times the same character is repeated
public class MapRunner2 {

	public static void main(String[] args) {
		String str = "Hi Helloo......" + "Ok byee....";
		Map<Character, Integer> occurance = new HashMap<>();
		char[] characters = str.toCharArray();
		for (char character : characters) {

			// Get the character
			Integer integer = occurance.get(character);
			if (integer == null) {
				occurance.put(character, 1);
			} else {
				occurance.put(character, integer + 1);
			}
		}
		System.out.println(occurance);

	}

}
