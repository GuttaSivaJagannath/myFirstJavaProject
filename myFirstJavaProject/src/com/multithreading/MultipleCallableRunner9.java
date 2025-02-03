package com.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner9 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		// here we can form a multiple tasks by creating a List
		// now all the list that we are storing in a variable by using the
		// command(Ctrl+1)
		List<CallableTask> tasks = List.of(new CallableTask("Siva"), new CallableTask("Jagannath"),
				new CallableTask("Gutta"));

		// there are a few methods in executorService, anotherOne is invokeAll, in this
		// we can pass in to a collection

		// in this, it will invoke all the tasks and it will return a list of futures
		List<Future<String>> results = executorService.invokeAll(tasks);
		for (Future<String> result : results) {
			System.out.println(result.get());// for the get() method we need throw and declaration
		}

		// Executors.newFixedThreadPool(1), if we need faster output than this then we
		// need to increase the threads, that is Executors.newFixedThreadPool(3)
		executorService.shutdown();
	}

}
