//-----------------------------------------------------------------
package expression;

/**
 * This defines the concept of an Expression. The expression is 
 * implemented as an array of tokens: where each token contains
 * a string.
 * 
 * @author Matt Andre
 * @version October 2012
 */
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Expression {
	// ---------------------------------------------------------------------

	// Expression stored as an array list of tokens
	private ArrayList<Token> expression;

	// ---------------------------------------------------------------------

	/**
	 * Constructs an expression from a string.
	 */
	public Expression(String exp) {
		// Create the array that represents the body of the Expression
		expression = new ArrayList<Token>();

		// Tokenize the expression using the String Tokenizer class.
		// Assumed that the tokens are seperated by spaces
		StringTokenizer strTok = new StringTokenizer(exp, " ");

		// Scan the input expression from left to right for tokens
		while (strTok.hasMoreElements()) {
			Token tok = new Token((String) strTok.nextElement());
			expression.add(tok);
		}
	}

	// ---------------------------------------------------------------------

	/**
	 * Constructs an empty expression.
	 */
	public Expression() {
		// Create the array that represents the body of the Expression
		expression = new ArrayList<Token>();
	}

	// -----------------------------------------------------------------

	/**
	 * Returns the number of tokens in expression
	 * 
	 * @return size
	 */
	public int size() {
		return expression.size();
	}

	// ---------------------------------------------------------------------

	/**
	 * Appending a token at the end of the expression
	 * 
	 * @param new token
	 */
	public void add(Token newElement) {
		expression.add(newElement);
	}

	// ---------------------------------------------------------------------

	/**
	 * Creates a printable string from the expression
	 */
	public String toString() {
		String ret = "";
		for (int i = 0; i < expression.size(); i++)
			ret = ret + expression.get(i).getBody() + " ";
		return ret;
	}

	// -----------------------------------------------------------------

	/**
	 * Returns expression as array list of tokens
	 * 
	 * @return expression token list
	 */
	public ArrayList<Token> getExpression() {
		return expression;
	}
}
