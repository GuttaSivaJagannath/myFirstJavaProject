package com.multithreading;

public class PriorityThreads3 {

	// in this step we are learning how to give priority to the threads
	// it should be in the range of MIN_PRIORITY=1; TO MAX_PRIORITY=10;
	// in thread class there is a method called setPriority(digit from 1 to 10);
	// for example if we want to give 10 priority to Task1, then
	// Task1.setPriority(10);
	// the default priority that is assigned to a thread is '5'

	public static void main(String[] args) {

		TaskOne taskOne = new TaskOne();
		taskOne.setPriority(1); // priority is just a request for the thread but not order
		taskOne.start();


		TaskTwo taskTwo = new TaskTwo();
		Thread t2 = new Thread(taskTwo);
		t2.setPriority(10);
		t2.start();

		System.out.println("Task3 Started : ");
		for (int i = 210; i <= 300; i += 10) {
			System.out.println(i);
		}
		System.out.println("Task3 Ended");
	}

}

class TaskOne extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 Started : ");
		for (int i = 10; i <= 100; i += 10) {
			System.out.println(i);
		}
		System.out.println("Task1 Ended");
	}
}

class TaskTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 Started : ");
		for (int i = 110; i <= 200; i += 10) {
			System.out.println(i);
		}
		System.out.println("Task2 Ended");
	}

}
