/**
 * A Tester for the StudentList Application
 * 
 * @author Matt Andre, Jeff Fisher
 * @date September 17, 2012
 * 
 */

public class StudentListTester {
	
	//---------------------------------------------------------------
	public static void main(String[] args) {
		
		//Initialize Student List from text file
		StudentList studentList = new StudentList("src\\studentAccountData.txt");
		
		//Print out expected and computed letter grades
		System.out.println("Expected = E");
		System.out.println(studentList.getDetails("bob"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = C");
		System.out.println(studentList.getDetails("jen"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = A");
		System.out.println(studentList.getDetails("tom"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = D");
		System.out.println(studentList.getDetails("pat"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = B");
		System.out.println(studentList.getDetails("jill"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = C");
		System.out.println(studentList.getDetails("joey"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = E");
		System.out.println(studentList.getDetails("cathy"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = B");
		System.out.println(studentList.getDetails("ben"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = A");
		System.out.println(studentList.getDetails("jane"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Expected = D");
		System.out.println(studentList.getDetails("jake"));
	
	}

}
