import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author mandr5
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
	 * @param open
	 * @param closed
	 * @return
	 */
	public abstract boolean matches(String open, String closed);

	public abstract boolean isOpenToken(String token);

	public abstract boolean isCloseToken(String token);
}
