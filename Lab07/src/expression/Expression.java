package expression;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Expression {
	private String expressionStr;
	private ArrayList<String> expression;

	public Expression(String expressionStr) {
		this.expressionStr = expressionStr;
		expression = new ArrayList<String>();
		StringTokenizer expressionTokenizer = new StringTokenizer(expressionStr);
		while (expressionTokenizer.hasMoreTokens()) {
			expression.add(expressionTokenizer.nextToken());
		}
	}

	public ArrayList<String> getExpression() {
		return expression;
	}
}
