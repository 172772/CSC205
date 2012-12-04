import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import linkedlist.DoublyLinkedList;

public class ContactList {

	DoublyLinkedList<Contact> contacts = new DoublyLinkedList<Contact>();

	public ContactList() {
		this("src/contacts.txt");
	}

	/**
	 * @param filename
	 */
	public ContactList(String fileName) {
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File: " + fileName + " is not found");
		}
		int numContacts = fileInput.nextInt();
		for (int i = 0; i < numContacts; i++) {
			String lastName = fileInput.next();
			String firstName = fileInput.next();
			String middleName = fileInput.next();
			int monthOfBirth = fileInput.nextInt();
			int dayOfBirth = fileInput.nextInt();
			String cellPhone = fileInput.next();
			String homePhone = fileInput.next();
			String email = fileInput.next();
			String address = fileInput.next();
			String city = fileInput.next();
			String state = fileInput.next();
			String zipcode = fileInput.next();
			Contact contact = new Contact(lastName, firstName, middleName,
					monthOfBirth, dayOfBirth, cellPhone, homePhone, email,
					address, city, state, zipcode);
			insert(contact);
		}
		contacts.resetCurrentElement();
		while (contacts.hasMoreElements()) {
			System.out.println(contacts.nextElement());
		}

	}

	public boolean insert(Contact contact) {
		contacts.resetCurrentElement();
		int location = 0;
		while (contacts.hasMoreElements()
				&& contacts.nextElement().compareTo(contact) < 0) {
			location++;
		}
		contacts.insertAt(contact, location);
		return true;
	}

	public boolean delete(Contact contact) {
		return true;
	}
	
	public DoublyLinkedList<Contact> search(Contact contact) {
		return null;
	}
	
	public DoublyLinkedList<Contact> search(String lastName, String firstName, String middleName,
			String monthOfBirth, String dayOfBirth, String cellPhone,
			String homePhone, String email, String address, String city,
			String state, String zipcode) {
		return search(new Contact(lastName, firstName, middleName,
				Integer.parseInt(monthOfBirth), Integer.parseInt(dayOfBirth), cellPhone, homePhone, email,
				address, city, state, zipcode));
	}
}
