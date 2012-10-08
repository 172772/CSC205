import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokenizerDemo {

	public static void main(String[] args) {
		Scanner standardInScanner = new Scanner(System.in);
		System.out.print("Name of File to tokenize: ");
		String fileName = standardInScanner.next();
		
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(1);
		}
		
		int numLinesInput = fileScanner.nextInt();
		for(int i = 0; i < numLinesInput; i++){
			String line = fileScanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, " ");
			while(tokenizer.hasMoreTokens()){
				System.out.println(tokenizer.nextToken());
			}
		}
	}

}
