package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner6 {

	public static void main(String[] args) {
		// because we are in the same package we can access all the tasks in previous
		// classes the way we create executorService is as below

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// here "newSingleThreadExecutor()" provides facilities to execute 1 thread at a
		// time, at that particular time the ExecutorService would be able to run one
		// thread

		executorService.execute(new Task1());// when task1 started executing, only when task1() completes the execution,
												// task2() would be executed, that is what happening here
		executorService.execute(new Thread(new Task2()));

		System.out.println("Task 3 Started : ");
		for (int i = 210; i <= 300; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task 3 Ended");

		// Recommended in the last line - ExecutorService.shutdown();,otherwise the
		// program will be in running stage
		executorService.shutdown();

	}

}
