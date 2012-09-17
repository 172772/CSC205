import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * A GUI for the StudentList Application
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 17, 2012
 */
public class StudentListGUI extends JFrame {

	//---------------------------------------------------------------
	
	//Holds the list of students
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

	//---------------------------------------------------------------
	/**
	 * The Constructor for the StudentListGUI
	 * 
	 * @param StudentList: A list of Students
	 */
	public StudentListGUI(StudentList studentList) {
		
		this.studentList = studentList;
		
		instantiateGUIComponents();
		buildGUI();
		addListeners();
		
		//Set default jframe close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set window size
		setSize(400, 300);
		
		//Set window visible
		setVisible(true);
		
	}

	//--------------------------------------------------------------
	private void instantiateGUIComponents() {
		
		//Initialize GUI Copmponents
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
		
		//Set display fields to be not editable 
		testGrade1Field.setEditable(false);
		testGrade2Field.setEditable(false);
		letterGradeField.setEditable(false);
		messageField.setEditable(false);
	}

	// --------------------------------------------------------------
	private void buildGUI() {
		
		Container c = getContentPane();
		
		//Set content pane to use grid layout
		c.setLayout(new GridLayout(6, 2, 10, 10));
		
		//Add GUI components to content pane
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
		
		//Add listener to letter grade button
		letterGradeButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// Get the name from the name field
				String name = nameField.getText();

				// Search for the Account with this name
				Student student = studentList.search(name);
				if (student != null) {
					// Student Exists
					
					//Fill in grades
					testGrade1Field.setText(new Integer(student.getGrade1()).toString());
					testGrade2Field.setText(new Integer(student.getGrade2()).toString());
					letterGradeField.setText(new Character(student.getLetterGrade()).toString());
					
					//Clear the error message
					messageField.setText("");

				} else {
					
					//Clear grade Fields
					testGrade1Field.setText("");
					testGrade2Field.setText("");
					letterGradeField.setText("");
					
					//Display Error Message
					messageField.setText("Error: Student does not exist");
					
				}
			}
			
		});
		
		//Add listener to quit button
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	// --------------------------------------------------------------
	public static void main(String[] args) {
		
		//Initialize student list from text file
		StudentList studentList = new StudentList("src\\studentAccountData.txt");

		//Initialize the GUI from the student list
		new StudentListGUI(studentList);
		
	}

}