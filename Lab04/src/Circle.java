/**
 * Holds data and information for a Circle
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public class Circle extends AbstractShape {

	// Holds circle radius
	private double radius;

	// Holds number of circles instantiated
	private static int numCirclesCreated = 0;

	/**
	 * Constructs circle from radius
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		assert (radius >= 0) : "Radius must be positive";
		this.radius = radius;
		numCirclesCreated++;
	}

	/*
	 * @see AbstractShape#area()
	 */
	@Override
	public double area() {
		double area = this.radius * this.radius * Math.PI;
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
		double perimeter = 2 * this.radius * Math.PI;
		assert (perimeter >= 0) : "Perimeter must be positive";
		return perimeter;
	}

	/**
	 * Returns the number of Circles instantiated
	 * 
	 * @return numberCirclesCreated
	 */
	public double getNumCirclesCreated() {
		return numCirclesCreated;
	}

}
