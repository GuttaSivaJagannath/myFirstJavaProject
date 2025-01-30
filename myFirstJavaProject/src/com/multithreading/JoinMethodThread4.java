package com.multithreading;

public class JoinMethodThread4 {

	// we use Join method for the next steps to wait while the specific method
	// to complete

	public static void main(String[] args) throws InterruptedException {

		TaskOneThread taskOneThread = new TaskOneThread();
		taskOneThread.start();

		TaskTwoThread taskTwoThread = new TaskTwoThread();
		Thread t2Thread = new Thread(taskTwoThread);
		t2Thread.start();

		// join()- Waits for this thread to terminate.
		taskOneThread.join(); // we need to add throws declaration for this step
		t2Thread.join();
		// after completion of above methods only, the execution will go to next step
		// after the completion of above Task1 and Task2 only the Task3 will be executed

		System.out.println("Task3 Started : ");
		for (int i = 210; i <= 300; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println("Task3 Ended");
	}

}

class TaskOneThread extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 Started : ");
		for (int i = 10; i <= 100; i += 10) {
			System.out.print(i + " ");
		}
		System.out.println("Task1 Ended");
	}
}

class TaskTwoThread implements Runnable {

		@Override
		public void run() {
			System.out.println("Task2 Started : ");
			for (int i = 110; i <= 200; i += 10) {
				System.out.print(i + " ");
			}
			System.out.println("Task2 Ended");
		}
	}

