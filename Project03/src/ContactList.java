import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import linkedlist.DoublyLinkedList;

/**
 * @author Matt
 * 
 */
public class ContactList {

	DoublyLinkedList<Contact> contacts = new DoublyLinkedList<Contact>();

	/**
	 * 
	 */
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
	}

	/**
	 * @param contact
	 * @return
	 */
	public boolean insert(Contact contact) {
		contacts.resetCurrentElement();
		while (contacts.hasMoreElements()) {
			Contact other = contacts.nextElement();
			if (other.getLastName().equals(contact.getLastName())
					&& other.getFirstName().equals(contact.getFirstName())) {
				return false;
			}
		}

		contacts.resetCurrentElement();
		int location = 0;
		while (contacts.hasMoreElements()
				&& contacts.nextElement().compareTo(contact) < 0) {
			location++;
		}
		contacts.insertAt(contact, location);
		return true;
	}

	/**
	 * @param contact
	 * @return
	 */
	public boolean delete(Contact contact) {
		contacts.resetCurrentElement();
		int location = 0;
		while (contacts.hasMoreElements()) {
			Contact other = contacts.nextElement();
			if (other.getLastName().equals(contact.getLastName())
					&& other.getFirstName().equals(contact.getFirstName())) {
				int confirm = JOptionPane.showConfirmDialog(
					    null,
					    "Are you sure you want to delete?",
					    "Delete Confirmations",
					    JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					contacts.deleteNth(location);
					return true;
				}else{
					return false;
				}
			}
			location++;
		}
		return false;
	}

	/**
	 * @param queryContact
	 * @return
	 */
	public DoublyLinkedList<Contact> search(Contact queryContact) {
		DoublyLinkedList<Contact> matchingContacts = new DoublyLinkedList<Contact>();
		contacts.resetCurrentElement();
		while (contacts.hasMoreElements()) {
			Contact contact = contacts.nextElement();
			if (contact.matches(queryContact)) {
				matchingContacts.insertAtEnd(contact);
			}
		}
		return matchingContacts;
	}

	/**
	 * @param lastName
	 * @param firstName
	 * @param middleName
	 * @param monthOfBirth
	 * @param dayOfBirth
	 * @param cellPhone
	 * @param homePhone
	 * @param email
	 * @param address
	 * @param city
	 * @param state
	 * @param zipcode
	 * @return
	 */
	public DoublyLinkedList<Contact> search(String lastName, String firstName,
			String middleName, String monthOfBirth, String dayOfBirth,
			String cellPhone, String homePhone, String email, String address,
			String city, String state, String zipcode) {
		return search(new Contact(lastName, firstName, middleName,
				monthOfBirth, dayOfBirth, cellPhone, homePhone, email, address,
				city, state, zipcode));
	}

	/**
	 * 
	 */
	public void save() {
		BufferedWriter fileOutput = null;
		try {

			fileOutput = new BufferedWriter(new FileWriter(new File(
					"src/contacts.txt")));
			fileOutput.write((contacts.length()) + "\n");
			contacts.resetCurrentElement();
			while (contacts.hasMoreElements()) {
				Contact contact = contacts.nextElement();
				String contactOutStr = contact.getLastName() + " ";
				contactOutStr += contact.getFirstName() + " ";
				contactOutStr += contact.getMiddleName() + " ";
				contactOutStr += contact.getMonthOfBirth() + " ";
				contactOutStr += contact.getDayOfBirth() + " ";
				contactOutStr += contact.getCellPhone() + " ";
				contactOutStr += contact.getHomePhone() + " ";
				contactOutStr += contact.getEmail() + " ";
				contactOutStr += contact.getAddress() + " ";
				contactOutStr += contact.getCity() + " ";
				contactOutStr += contact.getState() + " ";
				contactOutStr += contact.getZipcode() + "\n";

				fileOutput.write(contactOutStr);
			}
			fileOutput.close();
		} catch (IOException e) {
		}
	}

}
