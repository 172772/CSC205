/**
 * Tester Class for House List
 * @author Matt Andre
 *
 */
public class HouseListTester {
	
	private static HouseList availableHouses;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Initialize House list from houses.txt
		availableHouses = new HouseList("src//houses.txt");
		
		//Output Test Data
		Criteria criteria1 = new Criteria( 1000, 500000, 100, 5000, 0, 10 );
		System.out.println( criteria1.toString() );
		availableHouses.printHouses( criteria1 );
		
		System.out.println( "-------------------------------------------------------" );
		
		Criteria criteria2 = new Criteria( 1000, 100000, 500, 1200, 0, 3 );
		System.out.println( criteria2.toString() );
		availableHouses.printHouses( criteria2 );
		
		System.out.println( "-------------------------------------------------------" );
		
		Criteria criteria3 = new Criteria( 100000, 200000, 1000, 2000, 2, 3 );
		System.out.println( criteria3.toString() );
		availableHouses.printHouses( criteria3 );
		
		System.out.println( "-------------------------------------------------------" );
		
		Criteria criteria4 = new Criteria( 200000, 300000, 1500, 45000, 3, 6 );
		System.out.println( criteria4.toString() );
		availableHouses.printHouses( criteria4 );
		
		System.out.println( "-------------------------------------------------------" );
		
		Criteria criteria5 = new Criteria( 100000, 500000, 2500, 5000, 3, 6 );
		System.out.println( criteria5.toString() );
		availableHouses.printHouses( criteria5 );
		
	}

}
