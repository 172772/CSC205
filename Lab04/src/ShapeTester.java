import java.text.DecimalFormat;

/**
 * Tester Class for Shape
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 24, 2012
 * 
 */
public class ShapeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create format for computation ouput
		DecimalFormat computation = new DecimalFormat("0.00");

		// Create Shapes Array
		AbstractShape[] shapes = new AbstractShape[16];

		// Fill Shapes Array with Test shapes
		shapes[0] = new Rectangle(10, 5);
		shapes[1] = new Rectangle(20, 30);
		shapes[2] = new Rectangle(50, 10);
		shapes[3] = new Rectangle(-10, 20);

		shapes[4] = new Circle(20);
		shapes[5] = new Circle(10);
		shapes[6] = new Circle(30);
		shapes[7] = new Circle(-20);

		shapes[8] = new Cuboid(20, 10, 6);
		shapes[9] = new Cuboid(40, 5, 50);
		shapes[10] = new Cuboid(30, 20, 20);
		shapes[11] = new Cuboid(-20, 30, -10);

		shapes[12] = new Sphere(15);
		shapes[13] = new Sphere(25);
		shapes[14] = new Sphere(12);
		shapes[15] = new Sphere(-10);

		// Output test computations
		for (AbstractShape shape : shapes) {
			System.out.println("--------SHAPE--------");
			System.out.println("Area: " + computation.format(shape.area()));
			System.out.println("Perimeter: " + computation.format(shape.perimeter()));
			System.out.println("Volume: " + computation.format(shape.volume()));
			System.out.println();
		}

	}

}
