package com.exceptionHandling;

// puzzle7

// Q : will this code compile without catch block?

// Ans : Yes, it will compile

public class Puzzle7 {
	public String Connection() {
		String str = null;
		str.toString();
		return str;
	}
	public static void main(String[] args) {
		Puzzle7 p7 = new Puzzle7();
		try {
			p7.Connection();
		}
		// catch (Exception e) {
		// e.printStackTrace();
		// }
		finally {
			System.out.println("Finally!!");
		}
	}
}
