package com.EclipseTricksAndTips;

import java.math.BigDecimal;

public class CntrlPlusOne {

	private static final int MILLIS2 = 2000 * 100 * 10;

	public static void main(String[] args) throws InterruptedException {

		// Now If we take BigDecimal, ctrl+1 is used for importing this BigDecimal
		BigDecimal bd = new BigDecimal(25);

		// when you are throwing an exception also ctrl+1 is used to throw exception
		Thread.sleep(2000);// for throwing the declaration we used ctrl+1

		// for creating a class also, we can use ctrl+1
		DummyTest dt = new DummyTest();// the class created in the same package with different file

		// for creating a local variables also we can use ctrl+1
		int millis = 2000 * 45 * 34;
		Thread.sleep(millis);// by selecting the text(2000*45*34) and press ctrl+1 on that, it will give
										// option to create the local variable

		// for creating the methods also we can use ctrl+1
		Thread.sleep(extracted());

		// for creating the constants also we can use it
		Thread.sleep(MILLIS2);
		}

	private static int extracted() {
		return 1000 * 200 * 300;
	}

}

// In Interface also the ctrl+1 is used to add unimplemented methods that is compareTo in this
class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
