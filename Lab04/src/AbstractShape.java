
public abstract class AbstractShape implements TwoDShape, ThreeDShape {

	private static double numShapesCreated = 0;
	
	public void incrementNumShapesCreated(){
		numShapesCreated++;
	}
	
	public double getNumShapesCreated(){
		return numShapesCreated;
	}

	public abstract double area();

	public abstract double volume();

	public abstract double perimeter();

}
