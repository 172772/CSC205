
public class Exercises {
	
	public static void main(String[] args) {
		int[] a = {1,3,5,3,1,5,1};
		int[] b = {1,3,5,3,1,5,1};
		
		//1.a
		System.out.println(a[a.length / 2]);
		
		//1.b
		int smallest = a[0];
		for(int i = 0; i < a.length; i++){
			if(smallest > a[i]){
				smallest = a[i];
			}
		}
		System.out.println(smallest);
		
		//1.c
		System.out.println(a[0]);
		
		//1.d
		for(int i = 1; i < a.length; i++){
			if(a[i]==a[i-1]){
				System.out.println("Has a pair!");
			}
		}
		
		//1.e
		for(int i = 0; i < a.length; i++){
			for(int n = 0; n < a.length; n++){
				if(a[i]==a[n]){
					System.out.println("Has a repeated element!");
				}
			}
		}

		//1.f
		int x = 0;
		int numRepeats = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] == x){
				numRepeats++;
			}
		}
		System.out.println("x is in the array " + numRepeats + " times");
		
		//1.g
		for(int i = 0; i < a.length; i++){
			for(int n = 0; n < b.length; n++){
				if(a[i]==b[n]){
					System.out.println("a and b share an element!");
				}
			}
		}
		//1.h
		if(a[0] < b[b.length - 1]){
			System.out.println("an element of a is " +
					"< some element of b");
		}
		
	}

}
