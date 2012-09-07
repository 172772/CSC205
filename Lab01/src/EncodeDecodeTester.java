public class EncodeDecodeTester {

	public static void main(String[] args) {
       
		//Create test data
        String[] originalList = {
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789",
                "ABCDEFGHIJKLMnopqrstuvwxyz", "abc012", "!,.?'[]{}()<>",
                "   ", "AZaz09", "abcXYZ012789.!?","A Z", "a z", "abc xyz",
                "123+123=123+123", "567 MNO mno", "a,b,c,A,B,C,1,2,3"
        };
        
        String[] expectedEncodedList = {
                "CDEFGHIJKLMNOPQRSTUVWXYZAB", "cdefghijklmnopqrstuvwxyzab", "2345678901",
                "CDEFGHIJKLMNOpqrstuvwxyzab", "cde234", "!,.?'[]{}()<>",
                "   ", "CBcb21", "cdeZAB234901.!?","C B", "c b", "cde zab",
                "345+345=345+345", "789 OPQ opq", "c,d,e,C,D,E,3,4,5"
        };
        
        String[] expectedDecodedList = originalList;

        //Create Encoder/Decoder Object
		EncodeDecode encoderDecoder = new EncodeDecode(originalList);
		
		//Get encoded and decoded word lists
		String[] encodedList = encoderDecoder.getEncodedList();
		String[] decodedList = encoderDecoder.getDecodedList();
		
		//Check if all tests pass
		boolean testsPassed = true;
		
        //Print the table
        System.out.println( "Table of Test Results: " +
        	"\n-----------------------------------------------------------------------------------------------" + 
            "\nInput Word \tExpected Encoded Word \tEncoded Word \tExpected Decoded Word \tDecoded Word \tPass?");
        for (int i = 0; i < originalList.length; i++){
        	
        	//Check if test passed
        	boolean testPassed = ( expectedEncodedList[i].equals(encodedList[i]) ) && ( expectedDecodedList[i].equals(decodedList[i]) );
        	testsPassed = testsPassed && testPassed;
           
        	System.out.print( originalList[i] + "\t");
            System.out.print( expectedEncodedList[i] + "\t");
            System.out.print( encodedList[i] + "\t");
            System.out.print( expectedDecodedList[i] + "\t");
            System.out.print( decodedList[i] + "\t");
            System.out.println( testPassed ? "Passed" : "Failed" );
            
        }
        
        System.out.println( "-----------------------------------------------" +
        		"------------------------------------------------");
        System.out.println(testsPassed ? "All Tests Passed" : "One or More Tests Failed" );
        
	}
}
