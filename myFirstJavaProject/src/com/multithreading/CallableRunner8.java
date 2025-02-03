package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// here we are going to do that how to return a value from the thread
// up to now, to creating a thread we are implementing a Runnable interface
// now, to returning a value we are implementing Callable interface

class CallableTask implements Callable<String> {

	private String name;
	public CallableTask(String name) {
		this.name = name;
	}
	@Override // this is an unimplemented method that which came by Callable interface
	public String call() throws Exception {
		Thread.sleep(3000);// after 3 seconds the statement will execute
		return "Hi " + name;
	}

}

public class CallableRunner8 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);

		// here the submit method is used to execute the callable thing, if you want to
		// return a value, then we need to use submit method
		// assign with a new varaible(Ctrl+1)

		Future<String> welcomeFuture = executorService.submit(new CallableTask("Siva"));

		// the response from executorService is Future
		// on a Future we want to call get() method, Future is not a result, it is a
		// promise that there will be a result

		String welcomeMessage = welcomeFuture.get();// it throws an declaration that is exception

		// this above is thread which will execute parallel to the main method

		System.out.println("Main Method Executed");
		System.out.println(welcomeMessage);
		System.out.println("Main Method Completed");

		executorService.shutdown();
	}

}
