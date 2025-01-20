package com.myFirstJavaProject;

public class EncapsulationOne {
	private void royalEnfield() {
		int speed = 80;
		System.out.println(speed);
	}

	private void platina() {
		int speed = 40;
		System.out.println(speed);
	}
	public static void main(String[] args) {
		EncapsulationOne bikes = new EncapsulationOne();
		bikes.royalEnfield();
		bikes.platina();
		Bikes runner = new Bikes();
		runner.setSpeed(100);
	}

}
