import linkedlist.DoublyLinkedList;


public class IntegerListTester {

	public static void main(String[] args) {
		IntegerList integerList = new IntegerList();
		DoublyLinkedList<Integer> integers1 = new DoublyLinkedList<Integer>();
		integers1.insertAtEnd(1);
		integers1.insertAtEnd(2);
		integers1.insertAtEnd(3);
		integers1.insertAtEnd(4);
		integers1.insertAtEnd(5);
		integers1.insertAtEnd(6);
		integers1.insertAtEnd(7);
		integers1.insertAtEnd(8);
		integers1.insertAtEnd(9);
		integers1.insertAtEnd(10);
		System.out.println("Largest=" + integerList.largest(integers1));
		System.out.println("NumEven=" + integerList.largest(integers1));

	}

}
