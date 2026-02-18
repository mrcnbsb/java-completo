package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double amountPaid(double dollarPrice, double dollarsBought) {
		return dollarPrice * dollarsBought * (1 + IOF);
	}
}
