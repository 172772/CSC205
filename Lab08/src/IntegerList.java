import linkedlist.DoublyLinkedList;

public class IntegerList {
	public int largest(DoublyLinkedList<Integer> integerList) {
		integerList.resetCurrentElement();
		int largest = integerList.nextElement();

		while (integerList.hasMoreElements()) {
			int next = integerList.nextElement();
			if (largest < next) {
				largest = next;
			}
		}

		return largest;
	}

	public int countEven(DoublyLinkedList<Integer> integerList) {
		int numEven = 0;
		integerList.resetCurrentElement();
		while (integerList.hasMoreElements()) {
			if (integerList.nextElement() % 2 == 0) {
				numEven++;
			}
		}
		return numEven;
	}

	public int sum(DoublyLinkedList<Integer> integerList) {
		int sum = 0;
		integerList.resetCurrentElement();
		while (integerList.hasMoreElements()) {
			sum += integerList.nextElement();
		}
		return sum;
	}
}
