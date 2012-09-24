public class Circle extends AbstractShape {
	private double radius;
	private static int numCirclesCreated = 0;

	public Circle(double radius) {
		assert (radius >= 0) : "Radius must be positive";
		this.radius = radius;
		numCirclesCreated++;
		incrementNumShapesCreated();
	}

	@Override
	public double area() {
		double area = this.radius * this.radius * Math.PI;
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	@Override
	public double volume() {
		return 0;
	}

	@Override
	public double perimeter() {
		double perimeter = 2 * this.radius * Math.PI;
		assert (perimeter >= 0) : "Perimeter must be positive";
		return perimeter;
	}

}
