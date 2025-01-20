package com.simpleInterestCalulation;

import java.math.BigDecimal;

public class SimpleInterestCalculation {

	public static void main(String[] args) {

		SimpleIntrestCalculator calculator = new SimpleIntrestCalculator("239000", "10");
		BigDecimal answer = calculator.totalValue(2);

		System.out.println(answer);
	}
}
