/**
 * Represents users criteria for a house
 * @author Matt
 *
 */
public class Criteria {
	
	private double minimumPrice;
	private double maximumPrice;
	private int minimumArea;
	private int maximumArea;
	private int minimumNumberOfBedrooms;
	private int maximumNumberOfBedrooms;
	
	/**
	 * Constructor
	 * @param minimumPrice
	 * @param maximumPrice
	 * @param minimumArea
	 * @param maximumArea
	 * @param minimumNumberOfBedrooms
	 * @param maximumNumberOfBedrooms
	 */
	public Criteria(double minimumPrice, double maximumPrice, int minimumArea, int maximumArea, 
			int minimumNumberOfBedrooms, int maximumNumberOfBedrooms) {
		
		this.minimumPrice = minimumPrice;
		this.maximumPrice = maximumPrice;
		this.minimumArea = minimumArea;
		this.maximumArea = maximumArea;
		this.minimumNumberOfBedrooms = minimumNumberOfBedrooms;
		this.maximumNumberOfBedrooms = maximumNumberOfBedrooms;
		
	}

	/**
	 * @return the criteria
	 */
	@Override
	public String toString() {
		return "Criteria \n Price: " + minimumPrice + " - " + maximumPrice
				+ "\n Area: " + minimumArea + " - " + maximumArea 
				+ "\n Bedrooms: " 	+ minimumNumberOfBedrooms + " - "+ maximumNumberOfBedrooms + "\n";
	}
	
	/**
	 * @return the minimumPrice
	 */
	public double getMinimumPrice() {
		return minimumPrice;
	}
	
	/**
	 * @return the maximumPrice
	 */
	public double getMaximumPrice() {
		return maximumPrice;
	}
	
	/**
	 * @return the minimumArea
	 */
	public int getMinimumArea() {
		return minimumArea;
	}
	
	/**
	 * @return the maximumArea
	 */
	public int getMaximumArea() {
		return maximumArea;
	}
	
	/**
	 * @return the minimumNumberOfBedrooms
	 */
	public int getMinimumNumberOfBedrooms() {
		return minimumNumberOfBedrooms;
	}
	
	/**
	 * @return the maximumNumberOfBedrooms
	 */
	public int getMaximumNumberOfBedrooms() {
		return maximumNumberOfBedrooms;
	}

}
