import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import linkedlist.DoublyLinkedList;

/**
 * Implementation of a hash table that holds people.
 */
public class MyHashTable {
	private Object[] peopleHashList;
	private int comparisons = 0;

	/**
	 * Constructs a hash table from a text file
	 * 
	 * @throws FileNotFoundException
	 */
	public MyHashTable() throws FileNotFoundException {
		peopleHashList = new Object[100];
		for (int k = 0; k < peopleHashList.length; k++) {
			peopleHashList[k] = new DoublyLinkedList<Person>();
		}
		Scanner dataIn = new Scanner(new File("src/testData.txt"));
		while (dataIn.hasNext()) {
			int id = dataIn.nextInt();
			String name = dataIn.next() + " " + dataIn.next();
			insert(new Person(id, name));
		}
	}

	/**
	 * Returns the hash code value of a key
	 * 
	 * @param key
	 * @return hash code
	 */
	public int hash(int key) {
		return key % 100;
	}

	/**
	 * Inserts person into has table according to persons id.
	 * 
	 * @param person
	 */
	public void insert(Person person) {
		int location = hash(person.getId());
		DoublyLinkedList<Person> bucket = (DoublyLinkedList<Person>) peopleHashList[location];
		bucket.insertAtEnd(person);
	}

	/**
	 * Deletes person with given id from hash table
	 * 
	 * @param id
	 */
	public void delete(int id) {
		resetComparisons();
		int location = hash(id);
		DoublyLinkedList<Person> bucket = (DoublyLinkedList<Person>) peopleHashList[location];
		bucket.resetCurrentElement();
		int position = 0;
		while (bucket.hasMoreElements()) {
			Person person = bucket.nextElement();
			if (person.getId() == id) {
				comparisons++;
				bucket.deleteNth(position);
				break;
			}
			position++;
		}
	}

	/**
	 * Returns person with given id from has table
	 * 
	 * @param id
	 * @return person
	 */
	public Person search(int id) {
		resetComparisons();
		int location = hash(id);
		DoublyLinkedList<Person> bucket = (DoublyLinkedList<Person>) peopleHashList[location];
		bucket.resetCurrentElement();
		while (bucket.hasMoreElements()) {
			Person person = bucket.nextElement();
			if (person.getId() == id) {
				comparisons++;
				return person;
			}
		}
		return null;
	}

	/**
	 * Returns the number of comparions made since the counter was last reset.
	 * 
	 * @return comparisons
	 */
	public int getComparisons() {
		return comparisons;
	}

	/**
	 * Resets the comparisons counter
	 */
	public void resetComparisons() {
		comparisons = 0;
	}
}
