public class PascalBalanceChecker {

	public boolean isOpenBracket(char ch) {
		if (ch == '(' || ch == '[' || ch == '{' || ch == '<')
			return true;
		return false;
	}

	public boolean isCloseBracket(char ch) {
		if (ch == ')' || ch == ']' || ch == '}' || ch == '>')
			return true;
		return false;
	}

	public boolean matches(char op, char cl) {
		if (op == '(' && cl == ')')
			return true;
		if (op == '[' && cl == ']')
			return true;
		if (op == '{' && cl == '}')
			return true;
		if (op == '<' && cl == '>')
			return true;
		return false;
	}

	public boolean isBalanced(String expr) {
		ArrayStack<Character> s = new ArrayStack<Character>(20);
		for (int k = 0; k < expr.length(); k++) {
			char ch = expr.charAt(k);
			if (isOpenBracket(ch))
				s.push(ch);
			else if (isCloseBracket(ch)) {
				if (s.isEmpty())
					return false;
				char ch1 = s.top();
				if (!matches(ch1, ch))
					return false;
				s.pop();
			}
		}
		if (!s.isEmpty())
			return false;
		return true;
	}

	public static void main(String[] args) {
		StringBalanceChecker sbc = new StringBalanceChecker();
		String s1 = "(({[]} () ))";
		if (sbc.isBalanced(s1))
			System.out.println(s1 + " is balanced");
		else
			System.out.println(s1 + " is NOT balanced");
		String s2 = "(({[]} () ))]";
		if (sbc.isBalanced(s2))
			System.out.println(s2 + " is balanced");
		else
			System.out.println(s2 + " is NOT balanced");

	}

}
