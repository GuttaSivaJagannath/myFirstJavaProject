package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner3 {

	public static void main(String[] args) {
		String str = "Hi Hellooo... Hellooo..." + " Ok Ok byeee...";
		Map<String, Integer> stringOccurance = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {

			Integer integer = stringOccurance.get(word);
			if (integer == null) {
				stringOccurance.put(word, 1);
			} else {
				stringOccurance.put(word, integer + 1);
			}

		}
		System.out.println(stringOccurance);
	}

}
