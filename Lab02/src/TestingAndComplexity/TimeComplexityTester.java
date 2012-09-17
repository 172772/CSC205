package TestingAndComplexity;

public class TimeComplexityTester {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		IntSortSearch.printSum100();
		long endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		
		System.out.println("---------------------------------------");

		
		int[] small = new int[100];
		int[] medium = new int[1000];
		int[] large = new int[10000];
		
		for(int i = 0; i < small.length; i++){
			small[i] = (int) (Math.random()*10000);
		}
		
		for(int i = 0; i < medium.length; i++){
			medium[i] = (int) (Math.random()*10000);
		}
		
		for(int i = 0; i < large.length; i++){
			large[i] = (int) (Math.random()*10000);
		}
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(small, small[0]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(small, small[99]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(small, (int)(Math.random()*10000));
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		
		System.out.println("---------------------------------------");

		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(medium, medium[0]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(medium, medium[999]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(medium, (int)(Math.random()*10000));
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");

		
		System.out.println("---------------------------------------");

		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(large, large[0]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(large, large[9999]);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		startTime = System.nanoTime();
		IntSortSearch.linearSearch(large, (int)(Math.random()*10000));
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");

		
		System.out.println("---------------------------------------");

		
		startTime = System.nanoTime();
		IntSortSearch.selectionSort(large);
		endTime = System.nanoTime();
		System.out.println("ElapsedTime = " + (endTime-startTime)/1000+   " micro seconds");
		
		
	}
	
}
