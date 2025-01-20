package com.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {
	public static void main(String[] QueueRunner) {
		Queue<String> names = new PriorityQueue<>(new StringLengthCompartor());
		names.addAll(List.of("zebra", "cat", "bat", "axe", "apple"));
		System.out.println(names);

		// it will process by taking consideration in to order
		System.out.println(names.poll());
		System.out.println(names);

		System.out.println(names.poll());
		System.out.println(names);

		System.out.println(names.poll());
		System.out.println(names);

		System.out.println(names.poll());
		System.out.println(names);
	}
}

//if you need the order based on the length of the string then we can go for the comparator
class StringLengthCompartor implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}

}