/**
 * Abstract Class for Shape that implements a 2D and 3D shape
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public abstract class AbstractShape implements TwoDShape, ThreeDShape {

	// Holds the number of shapes instantiated
	private static double numShapesCreated = 0;

	/**
	 * AbstractShape Constructor: increments the number of shapes created.
	 */
	public AbstractShape() {
		incrementNumShapesCreated();
	}

	/**
	 * Increments the number of abstract shapes created
	 */
	public void incrementNumShapesCreated() {
		numShapesCreated++;
	}

	/**
	 * Returns the number of AbstractShapes instantiated
	 * 
	 * @return numbShapesCreated
	 */
	public double getNumShapesCreated() {
		return numShapesCreated;
	}

	/*
	 * @see Shape#area()
	 */
	public abstract double area();

	/*
	 * @see ThreeDShape#volume()
	 */
	public abstract double volume();

	/*
	 * @see TwoDShape#perimeter()
	 */
	public abstract double perimeter();

}
