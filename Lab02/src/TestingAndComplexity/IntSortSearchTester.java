package TestingAndComplexity;

import java.util.Arrays;

public class IntSortSearchTester {

	public static void main(String[] args) {
		linearSearchTester();
		binarySearchTester();
		selectionSortTester();
	}
	
	public static void linearSearchTester() {
		System.out.println("-------- Linear Search Tests --------");
	
		int[] a1 = {1};
		System.out.println("Expected = 0 \t Computed = " + IntSortSearch.linearSearch(a1, 1) + "\n");
		
		int[] a2 = {1,2};
		System.out.println("Expected = 1 \t Computed = " + IntSortSearch.linearSearch(a2, 2) + "\n");
		
		int[] a3 = {1,2,3,4,5};
		System.out.println("Expected = 0 \t Computed = " + IntSortSearch.linearSearch(a3, 1) + "\n");
		
		int[] a4 = {1,2,3,4,5};
		System.out.println("Expected = 4 \t Computed = " + IntSortSearch.linearSearch(a4, 5) + "\n");
		
		int[] a5 = {1,2,3,4,5};
		System.out.println("Expected = 2 \t Computed = " + IntSortSearch.linearSearch(a5, 3) + "\n");
		
		int[] a6 = {1,2,3,4,5};
		System.out.println("Expected = -1 \t Computed = " + IntSortSearch.linearSearch(a6, 6) + "\n");
	}
	
	public static void binarySearchTester() {
		System.out.println("-------- Binary Search Tests --------");
	
		int[] a1 = {1};
		System.out.println("Expected = 0 \t Computed = " + IntSortSearch.binarySearch(a1, 1) + "\n");
		
		int[] a2 = {1,2};
		System.out.println("Expected = 1 \t Computed = " + IntSortSearch.binarySearch(a2, 2) + "\n");
		
		int[] a3 = {1,2,3,4,5};
		System.out.println("Expected = 0 \t Computed = " + IntSortSearch.binarySearch(a3, 1) + "\n");
		
		int[] a4 = {1,2,3,4,5};
		System.out.println("Expected = 4 \t Computed = " + IntSortSearch.binarySearch(a4, 5) + "\n");
		
		int[] a5 = {1,2,3,4,5};
		System.out.println("Expected = 2 \t Computed = " + IntSortSearch.binarySearch(a5, 3) + "\n");
		
		int[] a6 = {1,2,3,4,5};
		System.out.println("Expected = -1 \t Computed = " + IntSortSearch.binarySearch(a6, 6) + "\n");
	}
	
	public static void selectionSortTester() {
		System.out.println("------- Selection Sort Tests --------");
		
		int[] a1 = {1};
		System.out.print("Expected = [1] \t");
		IntSortSearch.selectionSort(a1);
		System.out.println("Computed = " + Arrays.toString(a1) + "\n");	
		
		int[] a2 = {2,1};
		System.out.print("Expected = [1, 2] \t");
		IntSortSearch.selectionSort(a2);
		System.out.println("Computed = " + Arrays.toString(a2) + "\n");	
		
		int[] a3 = {1,2,3,4,5};
		System.out.print("Expected = [1, 2, 3, 4, 5] \t");
		IntSortSearch.selectionSort(a3);
		System.out.println("Computed = " + Arrays.toString(a3) + "\n");	
		
		int[] a4 = {5,4,3,2,1};
		System.out.print("Expected = [1, 2, 3, 4, 5] \t");
		IntSortSearch.selectionSort(a4);
		System.out.println("Computed = " + Arrays.toString(a4) + "\n");	
		
		int[] a5 = {-6,-2,-8,-1,-3};
		System.out.print("Expected = [-8, -6, -3, -2, -1] \t");
		IntSortSearch.selectionSort(a5);
		System.out.println("Computed = " + Arrays.toString(a5) + "\n");	
		
		int[] a6 = {6,-2,0,1,-3};
		System.out.print("Expected = [-3, -2, 0, 1, 6] \t");
		IntSortSearch.selectionSort(a6);
		System.out.println("Computed = " + Arrays.toString(a6) + "\n");	
		
		int[] a7 = {5,5,5,5,5};
		System.out.print("Expected = [5, 5, 5, 5, 5] \t");
		IntSortSearch.selectionSort(a7);
		System.out.println("Computed = " + Arrays.toString(a7) + "\n");	
	
	}

}
