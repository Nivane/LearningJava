package thisisnobody.math.basic;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest {
	public static void main(String[] args) {

		// ADD
		BigDecimal b = new BigDecimal("234.43");
		BigDecimal bres = b.add(new BigDecimal("450.23"));
		System.out.println("Add: " + bres);
		// Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.DOWN);
		BigDecimal bdecMath = b.add(new BigDecimal("450.23"), mc);
		System.out.println("Add using MathContext: " + bdecMath);

		BigDecimal bdec = b.subtract(new BigDecimal("34.765"));
		System.out.println("Subtract: " + bdec);
	}
}
