public class Student {
	private String name;
	private int grade1;
	private int grade2;
	private int grade3;
	private double averageGrade;
	private char letterGrade;

	public Student(String nm, int g1, int g2, int g3) {
		name = nm;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
		computeAndSetAverage();
		computeAndSetLetterGrade();
	}

	private void computeAndSetAverage() {
		averageGrade = (grade1 + grade2 + grade3) / 3.0;
	}

	private void computeAndSetLetterGrade() {
		if (averageGrade >= 90) {
			letterGrade = 'A';
		} else if (averageGrade >= 80) {
			letterGrade = 'B';
		} else if (averageGrade >= 70) {
			letterGrade = 'C';
		} else if (averageGrade >= 60) {
			letterGrade = 'D';
		} else
			letterGrade = 'E';
	}

	public double getAverage() {
		return averageGrade;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Student [name=" + name + ", grade1=" + grade1 + ", grade2="
				+ grade2 + ", grade3=" + grade3 + ", averageGrade="
				+ averageGrade + ", letterGrade=" + letterGrade + "]";
	}
}
