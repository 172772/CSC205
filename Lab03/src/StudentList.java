import java.io.*;
import java.util.*;

//------------------------------------------------------------
/**
 * Represents a collection of Student objects Creates the data in the
 * constructor Provides a method to search for a student given the name
 * 
 * @author trao
 * 
 */
public class StudentList {
	private ArrayList<Student> studentList;

	public StudentList(String filename) {
		studentList = new ArrayList<Student>();
		Scanner myFileIn = null;
		try {
			myFileIn = new Scanner(new File(filename));
		} catch (FileNotFoundException e2) {
			System.out.println("File: " + filename + " is not found");
			System.exit(0);
		}
		int numRecords = myFileIn.nextInt();
		String name;
		int grade1;
		int grade2;

		for (int k = 0; k < numRecords; k++) {
			name = myFileIn.next();
			grade1 = myFileIn.nextInt();
			grade2 = myFileIn.nextInt();
			Student nextStudent = new Student(name, grade1, grade2);
			studentList.add(nextStudent);
		}
	}

	// ------------------------------------------------------------
	/**
	 * search for s student with this name. If present, return the Student
	 * object. Otherwise, return null.
	 */
	public Student search(String name) {
		Student stu = null;
		for (int k = 0; k < studentList.size(); k++) {
			stu = studentList.get(k);
			if (stu.getName().equals(name))
				return stu;
		}
		return null;
	}

	// ------------------------------------------------------------
	/**
	 * Return all the details of a student with this name
	 */
	public String getDetails(String studentName) {
		Student stu = search(studentName);
		if (stu != null)
			return "name = " + stu.getName() + " grade1 = " + stu.getGrade1()
					+ " grade2 = " + stu.getGrade2() + " Letter Grade = "
					+ stu.getLetterGrade();
		else
			return "Student with name = " + studentName + " was not found";
	}

}
