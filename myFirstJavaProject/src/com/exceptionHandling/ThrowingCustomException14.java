package com.exceptionHandling;

class Amountss {
	private String currency;
	private int amount;

	Amountss(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	// here we are taking an object through parameter which is a class type(Amountss
	// that).
	// this line(17) is fine but if you want more specific we can extend the custom
	// exception that which is extended by the Exception class.

	// public void add(Amountss that) throws Exception.

	// now by using the custom exception we are extending this add() method by
	// custom class instead of direct usage of Exception.
	public void add(Amountss that) throws CurrencyDidNotMatchException
	{
		if (!this.currency.equals(that.currency)) {
			throw new CurrencyDidNotMatchException(
					"Hey Siva It Is Wrong..Currency not matched" + " " + this.currency + "&" + " " + that.currency);
		}
		this.amount = this.amount + that.amount;

	}

	@Override
	public String toString() { // if you are printing object then we need to override the toString method
		return currency + " " + amount;
	}
}

//throwing the custom exception

// it is not just sufficient that having an exception type,but  we want to have also a message

class CurrencyDidNotMatchException extends Exception {

	CurrencyDidNotMatchException(String message) {
		super(message);
	}
}

public class ThrowingCustomException14 {

	// here we are using the custom exception intsead of using the direct Exception
	// class by throwing CurrencyDidNotMatchException.
	// Intsead of throwing Custom Exception, there is another way to handle this by
	// using tryCatch block.Because of Checked exception we want to handle this

	public static void main(String[] args) throws CurrencyDidNotMatchException {

		Amountss amount1 = new Amountss("USD", 10);
		Amountss amount2 = new Amountss("EUV", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
