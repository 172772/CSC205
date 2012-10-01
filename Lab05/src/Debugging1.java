public class Debugging1 {
	/**
	 * Find how many times the letter g occurs in a String.
	 * This program has bugs in it. Use the debugger to find
	 * what the bugs are and fix them. 
	 */
	public static void main(String[] args)
	{
		int letterCount = 0;
		String checkWord = "Debugging";
		String singleLetter = "";
		for (int k = 0; k < checkWord.length(); k++)
		{
			singleLetter = checkWord.substring(k,k+1);
			if (singleLetter.equals("g")) letterCount++;
		}
		System.out.println("g was found " + letterCount + " times");
	}
}
