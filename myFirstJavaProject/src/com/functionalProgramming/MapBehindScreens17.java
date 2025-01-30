package com.functionalProgramming;

import java.util.List;
//.map(n -> n * n)
	// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
	// inside the Function interface there is an method called apply,
	// @FunctionalInterface
	// public interface Function<T, R>
	// R apply(T t);
	//Now we are going to write manual program that which the inner process of map
	// is going to happen
	import java.util.function.Function;

	class NumberSquareMapper implements Function<Integer, Integer> {

		@Override
		public Integer apply(Integer number) {
			return number * number;
		}

	}

	public class MapBehindScreens17 {

	public static void main(String[] args) {
		System.out.println("Normal Output : ");
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(n -> n * n).forEach(e -> System.out.println(e));

		// now we are calling the method that which we written manually, which is inner
		// process of the map function
		System.out.println("Function in Map : ");
		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().map(new NumberSquareMapper())
				.forEach(e -> System.out.println(e));

	}


}

