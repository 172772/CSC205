public class Debugging2 {
	public static void main(String[] args) {
		// ------Problem 2a. Print the numbers 1 to 10------------
		int i = 0;
		for (i=1; i<=10; i++)
		{ 
			System.out.println("Number is " + i); 
		}
		
		//--------Problem 2b. Comparing two Strings--------------
		String s1 = "abcd";
		String s2 = "abcd";
		String s3 = "abcdef";
		
		if (s1.equals(s2))
			System.out.println(s1 + " and " + s2 + " are equal");
		else
			System.out.println(s1 + " and " + s2 + " are NOT equal");
		
		if (s1.equals(s3))
			System.out.println(s1 + " and " + s3 + " are equal");
		else
			System.out.println(s1 + " and " + s3 + " are NOT equal");
		//-------------------------------------------------------
		/**
		 * Problem 2c. The following two loops are supposed to do 
             * the same thing. The while loop works fine, prints numbers 
             * 10 down to 0. However, the for loop has a problem. Fix it.
		 */
		int num = 10;           
		while(num >= 0)         
		{              
			System.out.println(num);               
			num--;          
		}     
		
		num = 10;
		for(int k = num; k >= 0; k--)          
		{              
			System.out.println(num);              
			num--;          
		}        
	}

}
