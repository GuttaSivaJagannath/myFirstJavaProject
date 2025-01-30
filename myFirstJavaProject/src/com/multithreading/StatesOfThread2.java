package com.multithreading;

public class StatesOfThread2 {
	// there are 5 steps in threads
	// 1. NEW;
	// 2. RUNNABLE;
	// 3. RUNNING;
	// 4. BLOCKED/WAITING
	// 5. TERMINATED/DEAD

	// Now By taking example we can take clarification on this

	/*
	 * For Example if we take the OUTPUT of class ThreadBasicRunner - Task1 is
	 * kickedOff Task2 is kickedOff Task 1 Started : Task 3 Started : Task 2 Started
	 * : 0 10 20 30 40 50 60 110 120 130 140 150 160 170 180 210 220 230 70 80 90
	 * 100 190 240 250 200 Task 2 Ended 260 270 280 290 Task 1 Ended 300 Task 3
	 * Ended
	 */

	/*
	 * NEW - When we create a Task1 instance, the Task1 is Ready but not executed
	 * yet. that state is called NEW, Before the execution of start method the state
	 * is called NEW
	 */

	/*
	 * TERMINATED/DEAD - if we take the above example, at the particular point after
	 * the Task1Ended,the Task1 is dead, this is called TERMINATED/DEAD
	 */

	/*
	 * RUNNING - if we take 0 from above output, the Task1 is in execution.Task1 at
	 * that particular point of stage is called "RUNNING" . Similary if we take 110,
	 * at paticular state Task2 is in "RUNNING" stage.
	 */

	/*
	 * RUNNABLE - if we take 230 from above output, the Task3 is in RUNNING stage,
	 * where TASK1, TASK2 are in RUNNABLE stage, because they are not waiting for
	 * anything, they were in ready butnot executing at that particular time
	 */

	/*
	 * BLOCKED/WAITING - A thread is considered to be in the blocked state when it
	 * is suspended, sleeping, or waiting for some time in order to satisfy some
	 * condition.
	 */
}
