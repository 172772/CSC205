/**
 * Holds data and information for a Sphere
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public class Sphere extends AbstractShape {

	// Holds radius of sphere
	private double radius;

	// Holds number of spheres instantiated
	private static int numSpheresCreated = 0;

	/**
	 * Constructs Sphere from radius
	 * 
	 * @param radius
	 */
	public Sphere(double radius) {
		assert (radius >= 0) : "Radius must be positive";
		this.radius = radius;
		numSpheresCreated++;

	}

	/*
	 * @see AbstractShape#area()
	 */
	@Override
	public double area() {
		double area = 4 * this.radius * this.radius * Math.PI;
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	/*
	 * @see AbstractShape#volume()
	 */
	@Override
	public double volume() {
		double volume = 4.0 / 3.0 * this.radius * this.radius * this.radius
				* Math.PI;
		assert (volume >= 0) : "Volume must be positive";
		return volume;
	}

	/*
	 * @see AbstractShape#perimeter()
	 */
	@Override
	public double perimeter() {
		return 0;
	}

	/**
	 * Returns the number of Spheres instantiated
	 * 
	 * @return the numSpheresCreated
	 */
	public static int getNumSpheresCreated() {
		return numSpheresCreated;
	}

}
