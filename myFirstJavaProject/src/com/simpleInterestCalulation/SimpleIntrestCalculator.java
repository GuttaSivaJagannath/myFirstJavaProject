package com.simpleInterestCalulation;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	BigDecimal principalAmount;
	BigDecimal interset;

	SimpleIntrestCalculator(String principalAmount, String interset) {

		this.interset = new BigDecimal(interset).divide(new BigDecimal(100));
		this.principalAmount = new BigDecimal(principalAmount);
	}

	public BigDecimal totalValue(int noOfYears) {
		BigDecimal totalValue = principalAmount
				.add(principalAmount.multiply(interset).multiply(new BigDecimal(noOfYears)));
		return totalValue;
	}
}
