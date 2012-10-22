package expression;

public class ValidityTester {
	public static void main(String[] args) {
		String[] expStrings = { 
				"20 + 10", 						// true
				"10 + 20 * 5", 					// true
				"( 10 + 20 * + 5 )", 			// false
				"( 10 * ( 10 + 20 ) / 15 )",	// true
				"( 10 + ( 20 – 12 ) 25 + 3 )",	// false
				"10 * ) 5 + 3 (", 				// false
				"( 18 * 2 * 3", 				// false
				"25 + 5 * 6  )", 				// false
				"12 10 + 6 *", 					// false
				"* + 5 6 7" 					// false
		};
		ExpressionValidityChecker evc = new ExpressionValidityChecker();
		boolean valid = false;
		for (int k = 0; k < expStrings.length; k++) {
			valid = evc.isValid(expStrings[k]);
			System.out.println(expStrings[k] + "\t isValid? = " + valid);
		}
	}
}
