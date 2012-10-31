import linkedlist.DoublyLinkedList;
//---------------------------------------------------

/**
 * Tester Class for Integer List
 * @author Matt Andre, Riley Bauer
 */
public class IntegerListTester {
	//---------------------------------------------------
	
	/**
	 * Main Method for tester
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create Integer list
		IntegerList integerList = new IntegerList();
		
		//---------------------------------------------------
		
		// Create linked list of integers
		DoublyLinkedList<Integer> integers1 = new DoublyLinkedList<Integer>();
		
		// Fill list
		integers1.insertAtEnd(1);
		integers1.insertAtEnd(2);
		integers1.insertAtEnd(3);
		integers1.insertAtEnd(4);
		integers1.insertAtEnd(5);
		integers1.insertAtEnd(6);
		integers1.insertAtEnd(7);
		integers1.insertAtEnd(8);
		
		// Output calculations
		System.out.println("List = { 1, 2, 3, 4, 5, 6, 7, 8 }");
		System.out.println("Largest = " + integerList.largest(integers1));
		System.out.println("Number of Even = " + integerList.countEven(integers1));
		System.out.println("Sum = " + integerList.sum(integers1));
		System.out.println();
		
		//---------------------------------------------------
		
		// Create linked list of integers
		DoublyLinkedList<Integer> integers2 = new DoublyLinkedList<Integer>();
		
		// Fill list
		integers2.insertAtEnd(-3);
		integers2.insertAtEnd(1);
		integers2.insertAtEnd(0);
		integers2.insertAtEnd(-2);
		integers2.insertAtEnd(2);
		integers2.insertAtEnd(3);
		integers2.insertAtEnd(1);
		integers2.insertAtEnd(3);
		
		// Output calculations
		System.out.println("List = { -3, 1, 0, -2, 2, 3, 1, 3 }");
		System.out.println("Largest = " + integerList.largest(integers2));
		System.out.println("Number of Even = " + integerList.countEven(integers2));
		System.out.println("Sum = " + integerList.sum(integers2));
		System.out.println();
		
		//---------------------------------------------------
		
		// Create linked list of integers
		DoublyLinkedList<Integer> integers3 = new DoublyLinkedList<Integer>();
		
		// Output calculations
		System.out.println("List = { }");
		System.out.println("Largest = " + integerList.largest(integers3));
		System.out.println("Number of Even = " + integerList.countEven(integers3));
		System.out.println("Sum = " + integerList.sum(integers3));
		System.out.println();	
	}

}
