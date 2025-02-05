package com.exceptionHandling;

//
class Amount {
	private String currency;
	private int amount;

	Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that)// here we can take object which is a class type
	{
		if (!this.currency.equals(that.currency)) {// if we didnt throw this Exception, the output will give like USD
													// instead of error for EUV
			throw new RuntimeException(
					"Hey Siva It Is Wrong..Currency not matched" + " " + this.currency + "&" + " " + that.currency);
			// it is Unchecked exception,that is why we no need to handle it by using
			// trycatch or throws from the class or main or method
		}
		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() { // if you are printing object then we need to override the toString method
		return currency + " " + amount;
	}
}

public class ThrowingUncheckedException12 {

	public static void main(String[] args) {

		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUV", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
