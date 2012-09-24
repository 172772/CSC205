public class Sphere extends AbstractShape {
	private double radius;
	private static int numSpheresCreated = 0;

	public Sphere(double radius) {
		assert (radius >= 0) : "Radius must be positive";
		this.radius = radius;
		numSpheresCreated++;
		incrementNumShapesCreated();
	}

	@Override
	public double area() {
		double area = 4 * this.radius * this.radius * Math.PI;
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	@Override
	public double volume() {
		double volume = 4.0 / 3.0 * this.radius * 
			this.radius * this.radius * Math.PI ;
		assert (volume >= 0) : "Volume must be positive";
		return volume;
	}

	@Override
	public double perimeter() {
		return 0;
	}

}
