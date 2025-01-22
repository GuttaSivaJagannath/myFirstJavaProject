package com.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class PrintOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

public class LamdaBehindScreens16 {

	public static void main(String[] args) {
		System.out.println("Normal output : ");
		List.of(12, 33, 45, 66, 78, 99).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

		// Stream <T> .filter ( Predicate <? super Integer> predicate);
		// the filter consists of predicate
		// boolean test(T t);, this is only the method that which is present without
		// implementation in the Prediacate class
		// for above filter function, this is the inner process that which is going to
		// happen

		// now what is the Working process of the Predicate in filter that which is
		// happening Behind the screen is
		System.out.println("Predicate in Filter : ");
		List.of(12, 33, 45, 66, 78, 99).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));

		// for forEach function the internal process is - void forEach(Consumer<? super
		// T> action);
		// forEach consist of Consumer
		// the Consumer interface consist of a method, that is void - accept(T t);

		// now the wprking process of consumer in forEach is
		System.out.println("Consumer in forEach : ");
		List.of(12, 33, 45, 66, 78, 99).stream().filter(new EvenNumberPredicate()).forEach(new PrintOutConsumer());

	}

}
