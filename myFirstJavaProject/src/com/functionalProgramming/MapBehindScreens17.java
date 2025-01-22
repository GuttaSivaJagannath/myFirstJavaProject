package com.functionalProgramming;

import java.util.List;

public class MapBehindScreens17 {

	public static void main(String[] args) {
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(n -> n * n).forEach(e -> System.out.println(e));
	}

}
