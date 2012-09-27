/**
 * Holds data and information for a Rectangle
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public class Rectangle extends AbstractShape {

	// Holds Length of rectangle
	private double length;

	// Holds width of rectangle
	private double width;

	// Holds number of rectangles instantiated
	private static int numRectanglesCreated = 0;

	/**
	 * Constructs Rectangle from Flength and width
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		assert (length >= 0 && width >= 0) : "Length and Width must be positive";
		this.length = length;
		this.width = width;
		numRectanglesCreated++;
	}

	/*
	 * @see AbstractShape#area()
	 */
	@Override
	public double area() {
		double area = this.length * this.width;
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	/*
	 * @see AbstractShape#volume()
	 */
	@Override
	public double volume() {
		return 0;
	}

	/*
	 * @see AbstractShape#perimeter()
	 */
	@Override
	public double perimeter() {
		double perimeter = 2 * (this.length + this.width);
		assert (perimeter >= 0) : "Perimeter must be positive";
		return perimeter;
	}

	/**
	 * Returns the number of Rectangles instantiated
	 * 
	 * @return the numRectanglesCreated
	 */
	public static int getNumRectanglesCreated() {
		return numRectanglesCreated;
	}

}
