package linkedlist;
/**
 * Illustrating a list implemented using a fixed-size array
 * @author trao
 * Oct 2011
 *
 */
public class ListWithArray {
	
	//------------------------------------------------
	// Maximum number of elements allowed in the list
	private final int SIZE = 100;
	
	//-------------------------------------------------------------
	//This is the body of the list. We assume that the list begins
	//at location 0 of the array
	private Object[] list = new Object[SIZE];
	
	//-------------------------------------------------
	// This represents the location of the last element of the list
	// When it is -1, the list is empty. When it is SIZE-1, list
	// is full
	private int end = -1;
	
	//-------------------------------------------------------------
	/**
	 * Because we are using a fixed-size array to implement list, 
	 * it can be full.
	 */
	public boolean isFull()
	{
		return (end == SIZE-1);
	}
	
	//-------------------------------------------------------------
	/**
	 * Testing for emptiness
	 */
	public boolean isEmpty()
	{
		return (end == -1);
	}
	
	//-------------------------------------------------------------
	/**
	 * Insert a new element x at the location loc
	 */
	public boolean insert(Object x, int loc)
	{
		//If list is full, return false
		if (isFull()) return false;
		
		//If location is illegal, return false
		if (loc < 0 || loc > end+1)
			return false;
		
		//Copy the elements at loactions loc .. end to the
		//next higher location, to make space for new element
		for (int k = end; k >= loc; k--)
			list[k+1] = list[k];
		
		//adjust the end
		end = end+1;
		
		//Now copy the new element x into loc
		list[loc]= x;
		
		//Insert successful, return true
		return true;
	}
	
	//-------------------------------------------------------------
	/**
	 * Delete the element at location loc
	 */
	public boolean delete(int loc)
	{
		//If the list is empty, return false
		if (isEmpty()) return false;
		
		//If loc is illegal, return false
		if (loc < 0 || loc > end) return false;
		
		//Copy elements at locations loc .. end 
		for (int k = loc+1; k <= end; k++)
			list[k-1] = list[k];
		
		//adjust the end
		end = end-1;
		
		//Delete successful, return true
		return true;
		
	}
	
	//-------------------------------------------------------------
	/**
	 * Return a String representation of the list
	 */
	public String toString()
	{
		String result = "";
		for (int k = 0; k <= end; k++)
			result = result + " " + list[k].toString();
		return result;
	}
	
}