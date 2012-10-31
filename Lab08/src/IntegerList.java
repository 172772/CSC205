import linkedlist.DoublyLinkedList;

//---------------------------------------------------

/**
 * Holds methods for a list of integers.
 * 
 * @author Matt Andre, Riley Bauer
 * 
 */
public class IntegerList {

	// ---------------------------------------------------

	/**
	 * Returns largest integer in list. Returns min integer value if list is
	 * empty.
	 * 
	 * @param integer list
	 * @return largest integer
	 */
	public int largest(DoublyLinkedList<Integer> integerList) {

		// Check if list is empty
		if (integerList.isEmpty()) {
			System.out.println("Error - List is empty");
			return Integer.MIN_VALUE;
		}

		// Reset current element of list
		integerList.resetCurrentElement();

		// Set largest element to first
		int largest = integerList.nextElement();

		// Check if there is a larger element in list
		while (integerList.hasMoreElements()) {
			int next = integerList.nextElement();
			if (largest < next) {
				largest = next;
			}
		}

		return largest;
	}

	// ---------------------------------------------------

	/**
	 * Returns number of even numbers in list
	 * 
	 * @param integer list
	 * @return number of even
	 */
	public int countEven(DoublyLinkedList<Integer> integerList) {

		// Set number of even to 0
		int numEven = 0;

		// Reset current element in list
		integerList.resetCurrentElement();

		// Check each item in list to see if it is even
		while (integerList.hasMoreElements()) {
			if (integerList.nextElement() % 2 == 0) {
				numEven++;
			}
		}

		return numEven;
	}

	// ---------------------------------------------------

	/**
	 * Returns the sum of the numbers in the list
	 * 
	 * @param integer list
	 * @return sum
	 */
	public int sum(DoublyLinkedList<Integer> integerList) {

		// Set sum to 0
		int sum = 0;

		// Reset current element in list
		integerList.resetCurrentElement();

		// Add each item in list to sum
		while (integerList.hasMoreElements()) {
			sum += integerList.nextElement();
		}

		return sum;
	}

}
