package com.multithreading;

public class ThreadsBasicRunner1 {

	// they were two methods of creating threads
	// 1. by extends Thread
	// 2. by implements Runnable
	public static void main(String[] args) {

		System.out.println("Task1 is kickedOff ");
		// creating instance of Task1
		Task1 task1 = new Task1();
		// in threads we cannot call run() method directly as like before with instance
		// if we call directly call run() method, it will behave like typical method
		// - intsead of thread
		task1.start();


		System.out.println("Task2 is kickedOff ");
		// Creating instance of Task2
		Task2 task2 = new Task2();
		// if we implementing Runnable interface, after creating instance we need to do
		// an additinal step to create the thread class
		Thread task2Thread = new Thread(task2);
		task2Thread.start();


		System.out.println("Task 3 Started : ");
		for (int i = 210; i <= 300; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task 3 Ended");
	}
}

// first step that by extends with Thread
class Task1 extends Thread {
	// in this thread we need to implement a thread,
	// the exact signature should be public void run()
	@Override
	public void run() { // SIGNATURE
		System.out.println("Task 1 Started : ");
		for (int i = 0; i <= 100; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task 1 Ended");
	}
}


// second step that by implements With Runnable
class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task 2 Started : ");
		for (int i = 110; i <= 200; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Task 2 Ended");
	}

}
