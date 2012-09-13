
public class House {
	
	private String address;
    private String city;
    private int price;
    private int area;
    private int numBedrooms;
	
    /**
	 * @param address
	 * @param city
	 * @param price
	 * @param area
	 * @param numBedrooms
	 */
	public House(String address, String city, int price, int area, int numBedrooms) {
		this.address = address;
		this.city = city;
		this.price = price;
		this.area = area;
		this.numBedrooms = numBedrooms;
	}
	
	/**
	 * @param criteria
	 * @return boolean: if criteria satisfies house
	 */
	public boolean satisfies(Criteria criteria) {
		return ( this.price >= criteria.getMinimumPrice() ) && 
				( this.price <= criteria.getMaximumPrice() ) &&
				( this.area >= criteria.getMinimumArea() ) && 
				( this.area <= criteria.getMaximumArea() ) &&
				( this.numBedrooms >= criteria.getMinimumNumberOfBedrooms() ) && 
				( this.numBedrooms <= criteria.getMaximumNumberOfBedrooms() );
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * @return the area
	 */
	public int getArea() {
		return area;
	}
	
	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}
	
	/**
	 * @return the House object as a string
	 */
	@Override
	public String toString() {
		return "House: \n Address: " + this.address + "\n City: " + this.city + "\n Price: "
				+ this.price + "\n Area: " + this.area + "\n Number of Bedrooms: " 
				+ this.numBedrooms + "\n";
	}

}
