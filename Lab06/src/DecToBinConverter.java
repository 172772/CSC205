import java.util.Stack;


/**
 * Converts Decimal Number to Binary
 * 
 * @author Matt Andre, Jeff Fisher
 *
 */
public class DecToBinConverter {

	/**
	 * Prints Decimal Number as Binary to standard out.
	 * 
	 * @param number
	 */
	public static void printInBin(int number) {
		Stack<Integer> binaryStack = new Stack<Integer>();
		
		while(number > 0){
			int remainder = number % 2;
			binaryStack.push(remainder);
			number = number / 2;
		}
		
		while(!binaryStack.empty()){
			int digit = binaryStack.pop();
			System.out.print(digit);
		}
		
	}

}
