public class Cuboid extends AbstractShape {
	private double length;
	private double width;
	private double height;
	private static int numCuboidsCreated = 0;

	public Cuboid(double length, double width, double height) {
		assert (length >= 0 && width >= 0 && height >= 0) : "Length and Width and Height must be positive";
		this.length = length;
		this.width = width;
		this.height = height;
		numCuboidsCreated++;
		incrementNumShapesCreated();
	}

	@Override
	public double area() {
		double area = 2 * (length * width + width * height + height * length);
		assert (area >= 0) : "Area must be positive";
		return area;
	}

	@Override
	public double volume() {
		double volume = length * width * height;
		assert (volume >= 0) : "Volume must be positive";
		return volume;
	}

	@Override
	public double perimeter() {
		return 0;
	}

}
