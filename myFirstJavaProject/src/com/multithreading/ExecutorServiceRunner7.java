package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner7 {

	public static void main(String[] args) {
		// in this we are playing with ExecutorService with multiple threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		// Normal calling of threads
		// Task task = new Task(2);
		// task.start();

		// ExecutorService calling of Multiple threads
		// for this "Executors.newFixedThreadPool(2)", At Maximum 2 threads are active
		// at any point of time
		// similary if we take "Executors.newFixedThreadPool(6)", At Maximum 6 threads
		// are active at any point of time
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		executorService.execute(new Task(8));
	}

}

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task " + number + " Started");
		for (int n = number * 100; n <= number * 100 + 100; n += 10) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("Task " + number + " Ended");
	}
}
