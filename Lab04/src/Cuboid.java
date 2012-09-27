/**
 * Holds data and information for a Cuboid
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public class Cuboid extends AbstractShape {

	// Holds length for Cuboid
	private double length;

	// Holds width for Cuboid
	private double width;

	// Holds height for Cuboid
	private double height;

	// Holds number of cuboids instantiated
	private static int numCuboidsCreated = 0;

	/**
	 * Constructs Cuboid from length, width and height
	 * 
	 * @param length
	 * @param width
	 * @param height
	 */
	public Cuboid(double length, double width, double height) {
		assert (length >= 0 && width >= 0 && height >= 0) : "Length and Width and Height must be positive";
		this.length = length;
		this.width = width;
		this.height = height;
		numCuboidsCreated++;
	}

	/*
	 * @see AbstractShape#area()
	 */
	@Override
	public double area() {
		double area = 2 * (length * width + width * height + height * length);
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	/*
	 * @see AbstractShape#volume()
	 */
	@Override
	public double volume() {
		double volume = length * width * height;
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
	 * Returns the number of Cuboids instantiated
	 * 
	 * @return the numCuboidsCreated
	 */
	public static int getNumCuboidsCreated() {
		return numCuboidsCreated;
	}

}
