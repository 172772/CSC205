//-----------------------------------------------------------------
package expression;

/**
 * Tester class for ExpressionEvaluator
 * 
 * @author (T.M. Rao)
 * @version (October 2006)
 */
public class ExpressionEvaluatorTester {
	public static void main(String[] args) {
		// Create an array of Test Data
		Expression[] testExpressions = { new Expression("25 + 45"),
				new Expression("10 * ( 5 + 3 )"), new Expression("20"),
				new Expression("10 * 5 + 3 "),
				new Expression("10 * ( 7 + ( 12 - 9 ) ) / 10  "),
				new Expression("100 % ( ( 3 + 2 ) + 3 ) / 4 ") };

		// Instantiate an ExpressionEvaluator
		ExpressionEvaluator ee = new ExpressionEvaluator();

		// For each expression in the array, print the expression,
		// evaluate the expression and print its value
		for (int i = 0; i < testExpressions.length; i++) {
			System.out.println("Infix Expression:       " + testExpressions[i]);
			System.out.println("Value of Expression:    "
					+ ee.evaluate(testExpressions[i]) + "\n\n");
		}
	}
}