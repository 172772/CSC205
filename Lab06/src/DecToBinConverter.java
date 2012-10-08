import java.util.Stack;


public class DecToBinConverter {

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
