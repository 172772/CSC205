import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a list of houses
 * @author Matt
 *
 */
public class HouseList {

	private List<House> houseList;

	/**
	 * Constructor
	 * @param fileName
	 */
	public HouseList(String fileName) {
		
		this.houseList = new ArrayList<House>();
		Scanner fileIn = null;
		
		try {
			fileIn = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File: " + fileName + " is not found");
			System.exit(0);
		}
		
		House house;
		String address;
		double price;
		int area;
		int numBedrooms;

		while( fileIn.hasNext() ) {
			
			address = fileIn.next();
			price = fileIn.nextDouble();
			area = fileIn.nextInt();
			numBedrooms = fileIn.nextInt();
			
			house = new House(address, price, area, numBedrooms);

			this.houseList.add(house);
			
		}
		
	}
	
	/**
	 * Prints all houses to console
	 * @param criteria
	 */
	public void printHouses(Criteria criteria) {
		
		Iterator<House> iterator = getMatchingHouses(criteria).iterator();
		House house;
		 
		while( iterator.hasNext() ){
		    
			house = iterator.next();
			System.out.println(house.toString());
		    
		}
		
	}
	
	/**
	 * Returns a list of houses
	 * @param criteria
	 * @return list of houses
	 */
	public ArrayList<House> getMatchingHouses(Criteria criteria) {
		
		ArrayList<House> matchingHouses = new ArrayList<House>();
		Iterator<House> iterator = houseList.iterator();
		House house;
		 
		while( iterator.hasNext() ){
		    house = iterator.next();
		    if( house.satisfies(criteria) ){
		    	matchingHouses.add(house);
		    }
		}
		
		return matchingHouses;
		
	}
	
}
 