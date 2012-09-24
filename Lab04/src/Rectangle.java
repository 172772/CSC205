public class Rectangle extends AbstractShape {
	private double length;
	private double width;
	private static int numRectanglesCreated = 0;

	public Rectangle(double length, double width) {
		assert (length >= 0 && width >= 0) : "Length and Width must be positive";
		this.length = length;
		this.width = width;
		numRectanglesCreated++;
		incrementNumShapesCreated();
	}

	@Override
	public double area() {
		double area = this.length * this.width;
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * (this.length + this.width);
		assert (perimeter >= 0) : "Perimeter must be positive";
		return perimeter;
	}

}
