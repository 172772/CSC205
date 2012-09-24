package written;

public class Tester {
	public static void main(String[] args) {
		ClassA a1 = new ClassA();
		System.out.println("=======1========");
		ClassA a2 = new ClassA(5);
		System.out.println("=======2========");
		ClassB b1 = new ClassB();
		System.out.println("=======3========");
		ClassA b2 = new ClassB(5);
		System.out.println("=======4========");
	}
}
