package expression;

import java.util.ArrayList;
import queue.ArrayListQueue;

public class ExpressionValidityChecker {
	String[] operatorList = {"+", "-", "/", "*", "%"};
	public boolean isValid(String expression) {
		boolean parenthesesOK = isBalanced(expression);
		boolean operatorsOK = operaratorsBetweenOperands(expression);
		return (parenthesesOK && operatorsOK);
	}

	public boolean isBalanced(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(')
				count++;
			else if (text.charAt(i) == ')')
				count--;
			if (count < 0)
				return false;
		}
		if (count != 0)
			return false;
		return true;
	}

	public boolean operaratorsBetweenOperands(String expressionStr) {
		Expression expression = new Expression(expressionStr);
		ArrayList<String> expressionTokens = expression.getExpression();
		ArrayListQueue<String> queue = new ArrayListQueue<String>();
		for (String token : expressionTokens) {
			if(!(token.equals("(") || token.equals("("))){
				queue.insert(token);
			}
		}
		boolean lastWasDigit = false;
		while(!queue.isEmpty()){
			String token = queue.delete();
			if(Character.isDigit(token.charAt(0))){
				if(lastWasDigit){
					return false;
				}
				lastWasDigit = true;
			}
			if(isOperator(token)){
				if(!lastWasDigit){
					return false;
				}
				lastWasDigit = false;
			}
		}

		return true;
	}
	
	public boolean isOperator(String check){
		for(int i=0; i<operatorList.length; i++){
			if(check.equals(operatorList[i])){
				return true;
			}
		}
		return false;
	}
}
