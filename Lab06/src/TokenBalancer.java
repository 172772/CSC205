import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Abstract Class that checks if list of tokens is balanced
 * 
 * @author Matt Andre, Jeff Fisher
 * 
 */
public abstract class TokenBalancer implements Balancer {

	/*
	 * @see Balancer#isBalanced(java.util.ArrayList)
	 */
	@Override
	public boolean isBalanced(ArrayList<String> tokenList) {
		Stack<String> tokenStack = new Stack<String>();
		Iterator<String> tokenIterator = tokenList.iterator();
		while (tokenIterator.hasNext()) {
			String token = tokenIterator.next();
			if (isOpenToken(token)) {
				tokenStack.push(token);
			} else if (isCloseToken(token)) {
				if (tokenStack.isEmpty()) {
					return false;
				}
				String openToken = tokenStack.peek();
				if (!matches(openToken, token)) {
					return false;
				}
				tokenStack.pop();
			}
		}

		if (!tokenStack.isEmpty()) {
			return false;
		}
		return true;
	}

	/**
	 * Checks if tokens are a matching set of open and close tokens.
	 * 
	 * @param open token
	 * @param closed token
	 * @return true if open and closed tokens are a matching set
	 */
	public abstract boolean matches(String open, String closed);

	/**
	 * Checks if token is opening token.
	 * 
	 * @param token
	 * @return true if token is opening token
	 */
	public abstract boolean isOpenToken(String token);

	/**
	 * Checks if token is closing token.
	 * 
	 * @param token
	 * @return true if token is closing token
	 */
	public abstract boolean isCloseToken(String token);
}
