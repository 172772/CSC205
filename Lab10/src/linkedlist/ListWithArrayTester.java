package linkedlist;


public class ListWithArrayTester {
	public static void main(String[] args)
	{
		ListWithArray lwa = new ListWithArray();
		
		//Test insert
		lwa.insert("abc", 0);
		lwa.insert("ijk", 1);
		lwa.insert("ABCD", 2);
		lwa.insert("pqrst", 0);
		System.out.println("List Now: [ "+lwa+" ]");
		
		//Test delete
		lwa.delete(1); //delete 
		System.out.println("List After deleting: [ "+lwa+" ]");
		
		lwa.delete(2);
		System.out.println("List After deleting: [ "+lwa+" ]");
	}

}