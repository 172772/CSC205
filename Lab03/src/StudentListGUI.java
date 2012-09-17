import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

/**
 * A GUI for the StudentList Application
 * 
 * @author Matt Andre, Jeff Fisher
 * 
 */
public class StudentListGUI extends JFrame {

	// ---------------------------------------------------------------
	private StudentList studentList;

	// Declare GUI Components
	private JLabel nameLabel;
	private JLabel testGrade1Label;
	private JLabel testGrade2Label;
	private JLabel letterGradeLabel;
	private JLabel messageLabel;
	private JTextField nameField;
	private JTextField testGrade1Field;
	private JTextField testGrade2Field;
	private JTextField letterGradeField;
	private JTextField messageField;
	private JButton letterGradeButton;
	private JButton quitButton;

	// ---------------------------------------------------------------
	public StudentListGUI(StudentList studentList) {
		this.studentList = studentList;
		instantiateGUIComponents();
		buildGUI();
		addListeners();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	// --------------------------------------------------------------
	private void instantiateGUIComponents() {
		nameLabel = new JLabel("Your Name:");
		testGrade1Label = new JLabel("Test Grade 1:");
		testGrade2Label = new JLabel("Test Grade 2:");
		letterGradeLabel = new JLabel("Letter Grade:");
		messageLabel = new JLabel("Message:");
		
		nameField = new JTextField(10);
		testGrade1Field = new JTextField(10);
		testGrade2Field = new JTextField(10);
		letterGradeField = new JTextField(10);
		messageField = new JTextField(10);

		letterGradeButton = new JButton("Letter Grade");
		quitButton = new JButton("QUIT");
		
		testGrade1Field.setEditable(false);
		testGrade2Field.setEditable(false);
		letterGradeField.setEditable(false);
		messageField.setEditable(false);
	}

	// --------------------------------------------------------------
	private void buildGUI() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(6, 2, 10, 10));
		c.add(nameLabel);
		c.add(nameField);
		c.add(testGrade1Label);
		c.add(testGrade1Field);
		c.add(testGrade2Label);
		c.add(testGrade2Field);
		c.add(letterGradeLabel);
		c.add(letterGradeField);
		c.add(letterGradeButton);
		c.add(quitButton);
		c.add(messageLabel);
		c.add(messageField);
	}

	// --------------------------------------------------------------
	private void addListeners() {
		
		/*
		 * depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the id from the id field
				String id = idField.getText();

				// Search for the Account with this id
				StudentAccount acc = myBank.search(id);
				if (acc != null) {
					// Account Exists. Check for password
					String password = passwordField.getText();
					if (acc.getPassword().equals(password)) {
						// Account Id and Password match
						String amtText = amountField.getText();
						if (!(amtText.equals(""))) {
							double amt = Double.parseDouble(amountField
									.getText());

							// Do the deposit
							boolean success = acc.deposit(amt);
							if (success == true)
								messageField.setText("OK: Deposit Successful");
							else
								messageField.setText("Deposit Unuccessful");
						} else {
							messageField.setText("Amount field is empty");
						}
					} else
						// Id/Password combination didn't match
						messageField.setText("Error: Incorrect Id/Password");
				} else
					messageField
							.setText("Error: Account with this Id does not exist");
			}
		});

		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the id from the id field
				String id = idField.getText();

				// Search for the student eith this id
				StudentAccount acc = myBank.search(id);
				if (acc != null) {
					String password = passwordField.getText();
					if (acc.getPassword().equals(password)) {
						String amtText = amountField.getText();
						if (!(amtText.equals(""))) {
							// Account Id and Password match
							double amt = Double.parseDouble(amountField
									.getText());

							// Do the withdrawal
							boolean success = acc.withdraw(amt);
							if (success == true)
								messageField
										.setText("OK: Withdrawal Successful");
							else
								messageField.setText("Withdrawal Unuccessful");
						} else {
							messageField.setText("Amount field is empty");
						}
					} else
						messageField.setText("Error: Incorrect Id/Password");
				} else
					messageField
							.setText("Error: Account with this Id does not exist");
			}
		});
		getBalanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the id from the id field
				String id = idField.getText();

				// Search for the student eith this id
				StudentAccount acc = myBank.search(id);
				if (acc != null) {
					String password = passwordField.getText();
					if (acc.getPassword().equals(password)) {
						// Account Id and Password match
						messageField.setText("Your Balance: "
								+ d2.format(acc.getBalance()));
					} else
						messageField.setText("Error: Incorrect Id/Password");
				} else
					messageField
							.setText("Error: Account with this Id does not exist");
			}
		});*/
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
		StudentList studentList = new StudentList("src\\studentAccountData.txt");


		new StudentListGUI(studentList);
	}

}