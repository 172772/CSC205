//-----------------------------------------------------------------
package expression;

/**
 * Represents a token in an expression. Just provides some static methods
 * 
 * @author Matt Andre
 * @version October 2012
 */
public class Token {
	// -------------------------------------------------------------
	
	// It classifies the following as "OPERATORS".
	private final static String[] validOperators = { "<", "<=", ">", ">=",
			"==", "!=", "||", "&&", "+", "-", "*", "/", "%" };

	// -------------------------------------------------------------
	
	private final static char OPENPAREN = '(';
	private final static char CLOSEDPAREN = ')';

	// -------------------------------------------------------------
	
	// Holds contents of token
	private String body;

	// -------------------------------------------------------------

	/**
	 * Constructs token from String
	 * 
	 * @param token body
	 */
	public Token(String body) {
		this.body = body;
	}

	// -------------------------------------------------------------

	/**
	 * Returns the contents of the token
	 * 
	 * @return token body
	 */
	public String getBody() {
		return body;
	}

	// -------------------------------------------------------------

	/**
	 * Returns true if token is an operator
	 * 
	 * @return is token operator
	 */
	public boolean isOperator() {
		for (int i = 0; i < validOperators.length; i++) {
			if (validOperators[i].equals(body)) {
				return true;
			}
		}
		return false;
	}

	// -------------------------------------------------------------

	/**
	 * Is the first char of the arg an open Parenthesis?
	 * 
	 * @return is token open parenthesis
	 */
	public boolean isOpenParen() {
		char ch = body.charAt(0);
		return (ch == OPENPAREN);
	}

	// -------------------------------------------------------------

	/**
	 * Is the first char of the arg an close Parenthesis?
	 * 
	 * @return is token closed parenthesis
	 */
	public boolean isClosedParen() {
		char ch = body.charAt(0);
		return (ch == CLOSEDPAREN);
	}

	// -------------------------------------------------------------

	/**
	 * Returns true if token is an operand
	 * 
	 * @return is token operand
	 */
	public boolean isOperand() {
		return (!((isOperator() || isOpenParen() || isClosedParen())));
	}

	// -------------------------------------------------------------

	/**
	 * Defines the precedence values for some operators.
	 * 
	 * @return precedence of operator
	 */
	public int getPrecedence() {
		if (body.equals("<") || body.equals("<=") || body.equals(">")
				|| body.equals(">="))
			return 1;
		else if (body.equals("==") || body.equals("!="))
			return 2;
		else if (body.equals("||"))
			return 3;
		else if (body.equals("&&"))
			return 4;
		else if (body.equals("+") || body.equals("-"))
			return 5;
		else if (body.equals("*") || body.equals("/") || body.equals("%"))
			return 6;
		return -1;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return body;
	}

}
