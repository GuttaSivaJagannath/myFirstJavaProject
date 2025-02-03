package com.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunner10 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Siva"), new CallableTask("Jagannath"),
				new CallableTask("Gutta"));

		// to give the fastest result, we will go for invokeAny

		String result = executorService.invokeAny(tasks);

			System.out.println(result);
			executorService.shutdown();
		}
	}
