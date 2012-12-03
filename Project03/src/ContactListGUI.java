import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContactListGUI extends JFrame {
	private JPanel navigationPanel;
	private JPanel dataEntryPanel;
	private JPanel resultsPanel;
	private JTextArea resultsArea;

	private JButton insertButton;
	private JButton deleteButton;
	private JButton searchButton;
	private JButton quitButton;

	private JLabel lastNameLabel = new JLabel("Last Name:");
	private JLabel firstNameLabel = new JLabel("First Name:");
	private JLabel middleNameLabel = new JLabel("Middle Name:");
	private JLabel monthOfBirthLabel = new JLabel("Month of Birth:");
	private JLabel dayOfBirthLabel = new JLabel("Day of Birth:");
	private JLabel cellPhoneNumberLabel = new JLabel("Cell Phone#:");
	private JLabel homePhoneNumberLabel = new JLabel("Home Phone#:");
	private JLabel eMailLabel = new JLabel("E-Mail:");
	private JLabel addressLabel = new JLabel("Street Address:");
	private JLabel cityLabel = new JLabel("City:");
	private JLabel stateLabel = new JLabel("State (2-letters)");
	private JLabel zipcodeLabel = new JLabel("Last Name:");

	private JTextField lastNameTextField = new JTextField(10);
	private JTextField firstNameTextField = new JTextField(10);
	private JTextField middleNameTextField = new JTextField(10);
	private JTextField monthOfBirthTextField = new JTextField(10);
	private JTextField dayOfBirthTextField = new JTextField(10);
	private JTextField cellPhoneNumberTextField = new JTextField(10);
	private JTextField homePhoneNumberTextField = new JTextField(10);
	private JTextField eMailTextField = new JTextField(10);
	private JTextField addressTextField = new JTextField(10);
	private JTextField cityTextField = new JTextField(10);
	private JTextField stateTextField = new JTextField(10);
	private JTextField zipcodeTextField = new JTextField(10);

	private ContactList myList;

	public ContactListGUI(ContactList cL) {
		myList = cL;
		instantiateGUIComponents();
		buildGUI();
		addListeners();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setVisible(true);
	}

	// --------------------------------------------------------------
	private void instantiateGUIComponents() {
		navigationPanel = new JPanel();
		dataEntryPanel = new JPanel();
		resultsPanel = new JPanel();
		resultsArea = new JTextArea();
		resultsArea.append("RESULTS APPEAR BELOW");
		insertButton = new JButton("INSERT");
		deleteButton = new JButton("DELETE");
		;
		searchButton = new JButton("SEARCH");
		quitButton = new JButton("QUIT");
	}

	// --------------------------------------------------------------
	private void buildGUI() {
		// --------------Get Content Pane to add components
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
		dataEntryPanel.add(eMailLabel);
		dataEntryPanel.add(eMailTextField);
		dataEntryPanel.add(addressLabel);
		dataEntryPanel.add(addressTextField);
		dataEntryPanel.add(cityLabel);
		dataEntryPanel.add(cityTextField);
		dataEntryPanel.add(stateLabel);
		dataEntryPanel.add(stateTextField);
		dataEntryPanel.add(zipcodeLabel);
		dataEntryPanel.add(zipcodeTextField);
		resultsPanel.add(resultsArea);
		c.setLayout(new GridLayout(1, 3));
		c.add(navigationPanel);
		c.add(dataEntryPanel);
		c.add(resultsPanel);
	}

	// --------------------------------------------------------------
	private void addListeners() {
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ContactList cL = new ContactList();

		new ContactListGUI(cL);
	}

}
