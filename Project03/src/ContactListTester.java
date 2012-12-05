import linkedlist.DoublyLinkedList;

/**
 * @author Matt
 *
 */
public class ContactListTester {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContactList cL = new ContactList("src\\contacts.txt");

		System.out.println("---- OCTOBER BORN---------");
		DoublyLinkedList<Contact> octoberBorn = cL.search("", "", "", "10", "", "", "", "", "", "", "", "");
		System.out.println(octoberBorn);
		System.out.println("---- NY RESIDENTS---------");
		DoublyLinkedList<Contact> nyResidents = cL.search("", "", "", "", "", "", "", "", "", "", "NY", "");
		System.out.println(nyResidents);
		System.out.println("---- 14420 RESIDENTS---------");
		DoublyLinkedList<Contact> residents14420 = cL.search("", "", "", "", "", "", "", "", "", "", "NY", "14420");
		System.out.println(residents14420);
		System.out.println("---- 516 AreaCode RESIDENTS---------");
		DoublyLinkedList<Contact> residents516 = cL.search("", "", "", "", "", "516-", "", "", "", "", "", "");
		System.out.println(residents516);
		System.out.println("---- gmail users ---------");
		DoublyLinkedList<Contact> gmailUsers = cL.search("", "", "", "", "", "", "", "gmail", "", "", "", "");
		System.out.println(gmailUsers);
	}
	
}
