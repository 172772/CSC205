
/**
 * Tester Class for DecToBInConverter
 * 
 * @author Matt Andre, Jeff Fisher
 *
 */
public class DecToBinConverterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[] numbers = { new Integer(23), new Integer(47),
				new Integer(257), new Integer(1023), new Integer(0),
				new Integer(82), new Integer(512), new Integer(100) };
		for(Integer number : numbers){
			System.out.println(number+" in binary is: ");
			DecToBinConverter.printInBin(number);
			System.out.println();
		}

	}

}
