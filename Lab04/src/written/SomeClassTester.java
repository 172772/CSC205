package written;

public class SomeClassTester {

	public static void main(String[] args) {
		SomeClass o1 = new SomeClass();
		SomeClass o2 = new SomeClass();
		
		//System.out.println("a1 = "+o1.a1);
		
		System.out.println("a1 = "+o1.a2);

		//System.out.println("a1 = "+SomeClass.a1);
				
		//System.out.println("a3 = "+SomeClass.a3);

		//o1.a1 = o1.a1+1;

		//o1.a3 = o1.a3+1;

		o1.a2 = o1.a2 + 1;

		//o1.method1();
		
		o1.method2();
		
		SomeClass.method3();

		o1 = o2;

		//SomeClass = o2;
		
		SomeClass o3 = new SomeClass();
		SomeClass o4 = new SomeClass();
		o3.a2 = 2;
		o4.a2 = 22;
		o3.a4 = 4;
		o4.a4 = 44;
		System.out.println(o3.a2);
		System.out.println(o4.a2);
		System.out.println(o3.a4);
		System.out.println(o4.a4);
		

	}

}
