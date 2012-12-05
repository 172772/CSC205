import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import linkedlist.DoublyLinkedList;

/**
 * ContactListGUI: provides a GUI for a ContactList.
 * 
 * @author Matt Andre
 */
public class ContactListGUI extends JFrame {
	//Panels for layout
	private JPanel navigationPanel;
	private JPanel dataEntryPanel;
	private JPanel resultsPanel;
	
	// --------------------------------------------------------------
	
	//Scroll text area fro outputting results
	private JTextArea resultsArea;
	private JScrollPane resultsScroll;
	
	// --------------------------------------------------------------

	//Buttons for contact list actions
	private JButton insertButton;
	private JButton deleteButton;
	private JButton searchButton;
	private JButton quitButton;
	
	// --------------------------------------------------------------

	//Labels for contact fields
	private JLabel lastNameLabel = new JLabel("Last Name:");
	private JLabel firstNameLabel = new JLabel("First Name:");
	private JLabel middleNameLabel = new JLabel("Middle Name:");
	private JLabel monthOfBirthLabel = new JLabel("Month of Birth:");
	private JLabel dayOfBirthLabel = new JLabel("Day of Birth:");
	private JLabel cellPhoneNumberLabel = new JLabel("Cell Phone#:");
	private JLabel homePhoneNumberLabel = new JLabel("Home Phone#:");
	private JLabel emailLabel = new JLabel("Email:");
	private JLabel addressLabel = new JLabel("Street Address:");
	private JLabel cityLabel = new JLabel("City:");
	private JLabel stateLabel = new JLabel("State (2-letters)");
	private JLabel zipcodeLabel = new JLabel("Zip Code:");
	
	// --------------------------------------------------------------

	// Text inputs for contact info
	private JTextField lastNameTextField = new JTextField(10);
	private JTextField firstNameTextField = new JTextField(10);
	private JTextField middleNameTextField = new JTextField(10);
	private JTextField monthOfBirthTextField = new JTextField(10);
	private JTextField dayOfBirthTextField = new JTextField(10);
	private JTextField cellPhoneNumberTextField = new JTextField(10);
	private JTextField homePhoneNumberTextField = new JTextField(10);
	private JTextField emailTextField = new JTextField(10);
	private JTextField addressTextField = new JTextField(10);
	private JTextField cityTextField = new JTextField(10);
	private JTextField stateTextField = new JTextField(10);
	private JTextField zipcodeTextField = new JTextField(10);
	
	// --------------------------------------------------------------

	//List of Contacts
	private ContactList contactList;
	
	// --------------------------------------------------------------

	/**
	 * Contstructs a contactlist gui from a contact list.
	 * 
	 * @param contactList
	 */
	public ContactListGUI(ContactList contactList) {
		this.contactList = contactList;
		instantiateGUIComponents();
		buildGUI();
		addListeners();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setVisible(true);
	}

	// --------------------------------------------------------------
	
	/**
	 * Instantiates the gui components
	 */
	private void instantiateGUIComponents() {
		navigationPanel = new JPanel();
		dataEntryPanel = new JPanel();
		resultsPanel = new JPanel();
		resultsArea = new JTextArea("", 22, 20);
		resultsArea.setEditable(false);
		resultsArea.setLineWrap(true);
		resultsScroll = new JScrollPane(resultsArea);
		resultsScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		insertButton = new JButton("INSERT");
		deleteButton = new JButton("DELETE");

		searchButton = new JButton("SEARCH");
		quitButton = new JButton("QUIT");
	}

	// --------------------------------------------------------------
	
	/**
	 * Adds components to panels and adds panels to main pane
	 */
	private void buildGUI() {
		Container c = getContentPane();
		navigationPanel.setLayout(new GridLayout(4, 1, 10, 10));
		dataEntryPanel.setLayout(new GridLayout(12, 2, 10, 10));
		navigationPanel.add(insertButton);
		navigationPanel.add(deleteButton);
		navigationPanel.add(searchButton);
		navigationPanel.add(quitButton);
		dataEntryPanel.add(lastNameLabel);
		dataEntryPanel.add(lastNameTextField);
		dataEntryPanel.add(firstNameLabel);
		dataEntryPanel.add(firstNameTextField);
		dataEntryPanel.add(middleNameLabel);
		dataEntryPanel.add(middleNameTextField);
		dataEntryPanel.add(monthOfBirthLabel);
		dataEntryPanel.add(monthOfBirthTextField);
		dataEntryPanel.add(dayOfBirthLabel);
		dataEntryPanel.add(dayOfBirthTextField);
		dataEntryPanel.add(cellPhoneNumberLabel);
		dataEntryPanel.add(cellPhoneNumberTextField);
		dataEntryPanel.add(homePhoneNumberLabel);
		dataEntryPanel.add(homePhoneNumberTextField);
		dataEntryPanel.add(emailLabel);
		dataEntryPanel.add(emailTextField);
		dataEntryPanel.add(addressLabel);
		dataEntryPanel.add(addressTextField);
		dataEntryPanel.add(cityLabel);
		dataEntryPanel.add(cityTextField);
		dataEntryPanel.add(stateLabel);
		dataEntryPanel.add(stateTextField);
		dataEntryPanel.add(zipcodeLabel);
		dataEntryPanel.add(zipcodeTextField);
		resultsPanel.add(resultsScroll);
		c.setLayout(new GridLayout(1, 3));
		c.add(navigationPanel);
		c.add(dataEntryPanel);
		c.add(resultsPanel);
	}

	// --------------------------------------------------------------
	
	/**
	 * Adds listeners to the buttons
	 */
	private void addListeners() {
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact newContact = new Contact(lastNameTextField.getText(),
						firstNameTextField.getText(), middleNameTextField
								.getText(), monthOfBirthTextField.getText(),
						dayOfBirthTextField.getText(), cellPhoneNumberTextField
								.getText(), homePhoneNumberTextField.getText(),
						emailTextField.getText(), addressTextField.getText(),
						cityTextField.getText(), stateTextField.getText(),
						zipcodeTextField.getText());
				if (contactList.insert(newContact)) {
					resultsArea.setText(newContact.getFirstName() + " "
							+ newContact.getLastName()
							+ " was added to your contacts.");
					lastNameTextField.setText("");
					firstNameTextField.setText("");
					middleNameTextField.setText("");
					monthOfBirthTextField.setText("");
					dayOfBirthTextField.setText("");
					cellPhoneNumberTextField.setText("");
					homePhoneNumberTextField.setText("");
					emailTextField.setText("");
					addressTextField.setText("");
					cityTextField.setText("");
					stateTextField.setText("");
					zipcodeTextField.setText("");
				} else {
					resultsArea.setText(newContact.getFirstName() + " "
							+ newContact.getLastName()
							+ " was not added to your contacts.");
				}
			}
		});
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoublyLinkedList<Contact> deleteContacts = contactList.search(
						lastNameTextField.getText(),
						firstNameTextField.getText(), "", "", "", "", "", "",
						"", "", "", "");
				if (!deleteContacts.isEmpty()) {
					deleteContacts.resetCurrentElement();
					Contact deleteContact = deleteContacts.nextElement();
					lastNameTextField.setText(deleteContact.getLastName());
					firstNameTextField.setText(deleteContact.getFirstName());
					middleNameTextField.setText(deleteContact.getMiddleName());
					monthOfBirthTextField.setText(deleteContact.getMonthOfBirth() + "");
					dayOfBirthTextField.setText(deleteContact.getDayOfBirth() + "");
					cellPhoneNumberTextField.setText(deleteContact.getCellPhone());
					homePhoneNumberTextField.setText(deleteContact.getHomePhone());
					emailTextField.setText(deleteContact.getEmail());
					addressTextField.setText(deleteContact.getAddress());
					cityTextField.setText(deleteContact.getCity());
					stateTextField.setText(deleteContact.getState());
					zipcodeTextField.setText(deleteContact.getZipcode());
					
					if(contactList.delete(deleteContact)){
						resultsArea.setText("Contact deleted.");
						lastNameTextField.setText("");
						firstNameTextField.setText("");
						middleNameTextField.setText("");
						monthOfBirthTextField.setText("");
						dayOfBirthTextField.setText("");
						cellPhoneNumberTextField.setText("");
						homePhoneNumberTextField.setText("");
						emailTextField.setText("");
						addressTextField.setText("");
						cityTextField.setText("");
						stateTextField.setText("");
						zipcodeTextField.setText("");
					}else{
						resultsArea.setText("Contact not deleted.");
					}
				} else {
					resultsArea.setText("Contact not found.");
				}

			}
		});
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact queryContact = new Contact(lastNameTextField.getText(),
						firstNameTextField.getText(), middleNameTextField
								.getText(), monthOfBirthTextField.getText(),
						dayOfBirthTextField.getText(), cellPhoneNumberTextField
								.getText(), homePhoneNumberTextField.getText(),
						emailTextField.getText(), addressTextField.getText(),
						cityTextField.getText(), stateTextField.getText(),
						zipcodeTextField.getText());
				DoublyLinkedList<Contact> searchResults = contactList.search(queryContact);
				String searchOutput = "";
				if (!searchResults.isEmpty()) {
					searchResults.resetCurrentElement();
					while(searchResults.hasMoreElements()){
						Contact contact = searchResults.nextElement();
						searchOutput += contact.getFirstName() + " " + contact.getLastName() + "\n" 
								+ "Cell Phone: " + contact.getCellPhone() + "\n\n";
					}
					resultsArea.setText(searchOutput);
				}else{
					resultsArea.setText("No contacts.");
				}
			}
		});
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactList.save();
				System.exit(0);
			}
		});
	}

	/**
	 * Entry point for the contact list application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ContactList contactList = new ContactList();

		new ContactListGUI(contactList);
	}

}
