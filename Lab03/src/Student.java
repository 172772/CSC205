//------------------------------------------------------------
/**
 * A student's record is represented by a name and two numerical grades, assumed
 * to be out of 100
 * 
 * @author trao
 * 
 */
public class Student {
	private String name;
	private int grade1;
	private int grade2;

	public Student(String n, int g1, int g2) {
		name = n;
		grade1 = g1;
		grade2 = g2;
	}

	// ------------------------------------------------------------
	/**
	 * Computes letter grade using the scheme >= 90 ==> 'A' etc.
	 * 
	 * @return
	 */
	public char getLetterGrade() {
		char letG = ' ';
		double numG = (grade1 + grade2) / 2.0;
		if (numG >= 90)
			letG = 'A';
		else if (numG >= 80)
			letG = 'B';
		else if (numG >= 70)
			letG = 'C';
		else if (numG >= 60)
			letG = 'D';
		else
			letG = 'E';
		return letG;
	}

	// ------------------------------------------------------------
	/**
	 * Just the getter methods
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public int getGrade1() {
		return grade1;
	}

	public int getGrade2() {
		return grade2;
	}
}
