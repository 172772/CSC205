import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CourseSectionGUI extends JFrame {

	private CourseSection courseSection;
	private JLabel resultsLabel;
	private JButton showAllButton;
	private JButton specificGradeButton;
	private JButton highestAverageButton;
	private JButton lowestAverageButton;
	private JButton quitButton;
	private JTextField inputField;
	private JTextArea outputField;

	public CourseSectionGUI() {
		courseSection = new CourseSection();
		instantiateComponents();
		buildGUI();
		setListeners();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 200);
		setVisible(true);

	}

	public void instantiateComponents() {
		resultsLabel = new JLabel("Results");
		showAllButton = new JButton("Show all students");
		specificGradeButton = new JButton("Students with a spec. grade");
		highestAverageButton = new JButton("Students with highest average");
		lowestAverageButton = new JButton("Students with lowest average");
		quitButton = new JButton("QUIT");
		inputField = new JTextField(10);
		outputField = new JTextArea();
		outputField.setEditable(false);
	}

	public void buildGUI() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 4, 10, 10));
		c.add(resultsLabel);
		c.add(showAllButton);
		c.add(specificGradeButton);
		c.add(inputField);
		c.add(outputField);
		c.add(highestAverageButton);
		c.add(lowestAverageButton);
		c.add(quitButton);
	}

	private void setListeners() {
		showAllButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				for (int i = 0; i < courseSection.allStudentes().size(); i++) {
					s += " " + courseSection.allStudentes().get(i);
					if ((i + 1) % 8 == 0) {
						s += "" + "\n";
					}
				}
				outputField.setText(s);

			}
		}));
		specificGradeButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if (inputField.getText().length() < 1) {
					outputField.setText("Please input a single" + "\n"
							+ "letter between A and E");
				} else {
					char grade = inputField.getText().charAt(0);
					grade = Character.toUpperCase(grade);
					if (!Character.isLetter(grade) || grade + 0 > 69) {
						outputField.setText("Please input a single" + "\n"
								+ "letter between A and E");
						return;
					}
					for (int i = 0; i < courseSection.studentsWiththisGrade(
							grade).size(); i++) {
						s += " "
								+ courseSection.studentsWiththisGrade(grade)
										.get(i);
						if ((i + 1) % 8 == 0) {
							s += "" + "\n";
						}
					}
					outputField.setText(s);
				}
			}
		}));
		highestAverageButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				for (int i = 0; i < courseSection.studentsWithHighestAverage()
						.size(); i++) {
					s += " "
							+ courseSection.studentsWithHighestAverage().get(i);
					if ((i + 1) % 8 == 0) {
						s += "" + "\n";
					}
				}
				outputField.setText(s);

			}
		}));
		lowestAverageButton.addActionListener((new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				for (int i = 0; i < courseSection.studentsWithLowestAverage()
						.size(); i++) {
					s += " " + courseSection.studentsWithLowestAverage().get(i);
					if ((i + 1) % 8 == 0) {
						s += "" + "\n";
					}
				}
				outputField.setText(s);

			}
		}));
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new CourseSectionGUI();
	}

}