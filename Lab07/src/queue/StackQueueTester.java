package queue;

public class StackQueueTester {

	public static void main(String[] args) {
		
		ArrayListQueue<String> q1 = new ArrayListQueue<String>();
		ArrayListQueue<String> q2 = new ArrayListQueue<String>();
		ArrayListQueue<String> q3 = new ArrayListQueue<String>();
		
		q1.insert("Mary");
		q1.insert("had");
		q1.insert("a");
		q1.insert("little");
		q1.insert("lamb");
		
		q2.insert("Mary");
		q2.insert("had");
		q2.insert("a");
		q2.insert("little");
		q2.insert("lamb");
		
		q3.insert("Mary");
		q3.insert("had");
		q3.insert("a");
		q3.insert("little");
		q3.insert("pony");
		
		q1.equals(q2);
		q1.equals(q3);
		q2.equals(q3);

	}

}
