package written;
public class SomeClass {
	private int a1 = 10;
	public static int a2 = 20;
	public final int a3 = 300;
	public int a4 = 40;

	private void method1() {
		a1 = 100;
		a2 = 200;
		a4 = 400;
	}

	public void method2() {
		a1 = 1000;
		a2 = 2000;
		a4 = 4000;
	}

	public static void method3() {
	}
}
