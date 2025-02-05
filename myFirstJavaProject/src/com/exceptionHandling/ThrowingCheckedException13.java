package com.exceptionHandling;

class Amounts {
	private String currency;
	private int amount;

	Amounts(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amounts that) throws Exception// here we can take object which is a class type(Amount that)
	{
		if (!this.currency.equals(that.currency)) {// if we didnt throw this Exception, the output will give like USD
													// instead of error for EUV

			// here it is this Not Unchecked exception that is why we want to throws
			// Exception to the method.
			// Checked exception - which is not a Runtime Exception or subclass of Runtime
			// Exception.
			throw new Exception(
					"Hey Siva It Is Wrong..Currency not matched" + " " + this.currency + "&" + " " + that.currency);
		}
		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() { // if you are printing object then we need to override the toString method
		return currency + " " + amount;
	}
}

public class ThrowingCheckedException13 {
	public static void main(String[] args) throws Exception {

		Amounts amount1 = new Amounts("USD", 10);
		Amounts amount2 = new Amounts("EUV", 20);
		// because of checked exception we need to handle the code by using trycatch or
		// we need to throws the exception to the main
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
