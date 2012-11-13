import java.util.ArrayList;

import linkedlist.DoublyLinkedList;

public class CourseSection {
	private DoublyLinkedList<Student> studentList;
	private double highestAverage;
	private double lowestAverage;

	public CourseSection() {
		studentList = new DoublyLinkedList<Student>();
		studentList.insertAtEnd(new Student("aaa", 60, 69, 79));
		studentList.insertAtEnd(new Student("aab", 70, 89, 59));
		studentList.insertAtEnd(new Student("aac", 80, 79, 89));
		studentList.insertAtEnd(new Student("aad", 90, 89, 99));
		studentList.insertAtEnd(new Student("aae", 40, 59, 89));
		studentList.insertAtEnd(new Student("aba", 60, 69, 79));
		studentList.insertAtEnd(new Student("abb", 30, 89, 59));
		studentList.insertAtEnd(new Student("abc", 80, 89, 69));
		studentList.insertAtEnd(new Student("abd", 90, 89, 79));
		studentList.insertAtEnd(new Student("abe", 40, 59, 69));
		studentList.insertAtEnd(new Student("aca", 70, 69, 79));
		studentList.insertAtEnd(new Student("acb", 70, 89, 59));
		studentList.insertAtEnd(new Student("acc", 80, 79, 69));
		studentList.insertAtEnd(new Student("acd", 90, 89, 99));
		studentList.insertAtEnd(new Student("ace", 40, 59, 89));
		studentList.insertAtEnd(new Student("ada", 60, 88, 79));
		studentList.insertAtEnd(new Student("adb", 70, 89, 79));
		studentList.insertAtEnd(new Student("adc", 80, 79, 89));
		studentList.insertAtEnd(new Student("add", 90, 79, 79));
		studentList.insertAtEnd(new Student("ade", 10, 59, 49));

	}

	private void computeAndSetHighestAverage() {
		studentList.resetCurrentElement();
		highestAverage = studentList.nextElement().getAverage();
		double tempAv;
		while (studentList.hasMoreElements()) {
			tempAv = studentList.nextElement().getAverage();
			if (highestAverage < tempAv) {
				highestAverage = tempAv;
			}
		}
	}

	private void computeAndSetLowestAverage() {
		studentList.resetCurrentElement();
		lowestAverage = studentList.nextElement().getAverage();
		double tempAv;
		while (studentList.hasMoreElements()) {
			tempAv = studentList.nextElement().getAverage();
			if (lowestAverage > tempAv) {
				lowestAverage = tempAv;
			}
		}
	}

	public ArrayList<String> allStudentes() {
		ArrayList<String> names = new ArrayList<String>();
		studentList.resetCurrentElement();
		while (studentList.hasMoreElements()) {
			names.add(studentList.nextElement().getName());
		}
		return names;
	}

	public ArrayList<String> studentsWithHighestAverage() {
		computeAndSetHighestAverage();
		studentList.resetCurrentElement();
		ArrayList<String> studentsWithHighestAverage = new ArrayList<String>();
		while (studentList.hasMoreElements()) {
			Student tempStudent = studentList.nextElement();
			if (tempStudent.getAverage() == highestAverage) {
				studentsWithHighestAverage.add(tempStudent.getName());
			}
		}
		return studentsWithHighestAverage;
	}

	public ArrayList<String> studentsWithLowestAverage() {
		computeAndSetLowestAverage();
		studentList.resetCurrentElement();
		ArrayList<String> studentsWithLowestAverage = new ArrayList<String>();
		while (studentList.hasMoreElements()) {
			Student tempStudent = studentList.nextElement();
			if (tempStudent.getAverage() == lowestAverage) {
				studentsWithLowestAverage.add(tempStudent.getName());
			}
		}
		return studentsWithLowestAverage;
	}

	public ArrayList<String> studentsWiththisGrade(char g) {
		computeAndSetLowestAverage();
		studentList.resetCurrentElement();
		ArrayList<String> studentsWithThisGrade = new ArrayList<String>();
		while (studentList.hasMoreElements()) {
			Student tempStudent = studentList.nextElement();
			if (tempStudent.getLetterGrade() == g) {
				studentsWithThisGrade.add(tempStudent.getName());
			}
		}
		return studentsWithThisGrade;
	}
}