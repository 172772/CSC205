import java.io.FileNotFoundException;

/**
 * Tester Class for MyHashTable
 */
public class HashTableTester {

	/**
	 * Main method for tester
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// Init Hash Table
		MyHashTable hashTable = new MyHashTable();

		// ------------------------------------------------

		// Test Data

		hashTable.resetComparisons();
		Person person1 = hashTable.search(324161);
		if (person1 != null) {
			System.out.println(person1);
		} else {
			System.out.println("Person with id = 324161 does not exist");
		}
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

		// ------------------------------------------------

		hashTable.resetComparisons();
		Person person2 = hashTable.search(890343);
		if (person2 != null) {
			System.out.println(person2);
		} else {
			System.out.println("Person with id = 890343 does not exist");
		}
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

		// ------------------------------------------------

		hashTable.resetComparisons();
		Person person3 = hashTable.search(555555);
		if (person3 != null) {
			System.out.println(person3);
		} else {
			System.out.println("Person with id = 555555 does not exist");
		}
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

		// ------------------------------------------------

		hashTable.resetComparisons();
		hashTable.delete(528084);
		System.out.println("Person with id = 528084 deleted if exists");
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

		// ------------------------------------------------

		hashTable.resetComparisons();
		hashTable.delete(890343);
		System.out.println("Person with id = 890343 deleted if exists");
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

		// ------------------------------------------------

		hashTable.resetComparisons();
		Person person4 = hashTable.search(890343);
		if (person4 != null) {
			System.out.println(person4);
		} else {
			System.out.println("Person with id = 890343 does not exist");
		}
		System.out.println("Number of Comparisons = "
				+ hashTable.getComparisons());

	}
}