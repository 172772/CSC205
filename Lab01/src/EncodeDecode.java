/**
 * 
 * Encodes and Decodes a collection of words.
 * 
 * @author Matt Andre, Jeffrey Fisher
 * @version 1.0
 */

public class EncodeDecode {
	
	//------------------------------------------------------------------------------------
	
	//Offset of the mapping of characters
	private final static int OFFSET = 2;
	
	//------------------------------------------------------------------------------------
	
	//Input list of words
	private String[] originalList;
	
	//------------------------------------------------------------------------------------
	
	//Encoded list of words
	private String[] encodedList;
	
	//------------------------------------------------------------------------------------
	
	//Decoded list of words
	private String[] decodedList;
	
	//------------------------------------------------------------------------------------
	
    /**
     * The constructor:
     * Encodes and decodes the original list of words
     * @param originalList: an array of Strings
     */

	public EncodeDecode(String[] originalList) {
		
		//Initialize the word lists
		this.originalList = originalList;
		this.encodedList = new String[this.originalList.length];
		this.decodedList = new String[this.originalList.length];

		//Loop through each word in the original list of words
		for(int i = 0; i < this.originalList.length; i++){
			
			String originalWord = this.originalList[i];
			
			//Encode word and then decode the encoded word
			String encodedWord = encode(originalWord);
			String decodedWord = decode(encodedWord);
			
			//Store encoded and decoded words
			this.encodedList[i] = encodedWord;
			this.decodedList[i] = decodedWord;
			
		}
	}

	//------------------------------------------------------------------------------------
	
    /**
     * Encodes a word.
     * @param originalWord: A string object
     * @return String: result of encoding
     */
	
	public String encode(String originalWord) {
		
		String codedWord = new String();
		
		//Loop through each character in the word
		for(int i = 0; i < originalWord.length(); i++){
			
			//Forward Map each character and add it to the the encoded word
			codedWord += forwardMap(originalWord.charAt(i));
			
		}

		return codedWord;
	}
	
	//------------------------------------------------------------------------------------
	
    /**
     * Decodes a word.
     * @param codedWord: A string object
     * @return String: result of decoding
     */
	
	public String decode(String codedWord) {
		
		String decodedWord = new String();
		
		//Loop through each character in the word
		for(int i = 0; i < codedWord.length(); i++){
			
			//Back Map each character and add it to the the decoded word
			decodedWord += backMap(codedWord.charAt(i));
			
		}

		return decodedWord;
	}
	
	//------------------------------------------------------------------------------------
	
    /**
     * Maps a character that is a letter or number forward by offset.
     * Non-numbers and non-letters map to themselves.
     * @param originalCharacter: A char
     * @return char: result of mapping
     */
	
	public char forwardMap(char originalCharacter) {
		
		//Set coded character to original in case it is not mapped
		char codedCharacter = originalCharacter;
		
		//Check if character is a lower case letter
		if(originalCharacter >= 'a' && originalCharacter <= 'z'){
			
			//Get current position of character
			int currentAlphabeticPosition = originalCharacter - 'a';
			
			//Get the coded position by offsetting the current position
			int codedAlphabeticPosition = ( ( currentAlphabeticPosition + OFFSET ) % 26 ) + (int)'a';
			
			//Get the character at the coded position
			codedCharacter = (char)codedAlphabeticPosition;
			
		}
		
		//Check if character is a lower case letter
		if(originalCharacter >= 'A' && originalCharacter <= 'Z'){
			
			//Get current position of character
			int currentAlphabeticPosition = originalCharacter - 'A';
			
			//Get the coded position by offsetting the current position
			int codedAlphabeticPosition = ( ( currentAlphabeticPosition + OFFSET ) % 26 ) + (int)'A';
			
			//Get the character at the coded position
			codedCharacter = (char)codedAlphabeticPosition;
			
		}
		
		//Check if character is a number
		if(originalCharacter >= '0' && originalCharacter <= '9'){
			
			//Get current position of character
			int currentNumericPosition = originalCharacter - '0';
			
			//Get the coded position by offsetting the current position
			int codedNumericPosition = ( ( currentNumericPosition + OFFSET ) % 10 ) + (int)'0';
			
			//Get the character at the coded position
			codedCharacter = (char)codedNumericPosition;
			
		}
		
		return codedCharacter;
	}
	
	//------------------------------------------------------------------------------------
	
    /**
     * Maps a character that is a letter or number backward by offset.
     * Non-numbers and non-letters map to themselves.
     * @param codedCharacter: A char
     * @return char: result of mapping
     */
	
	public char backMap(char codedCharacter) {
		
		//Set decoded character to coded in case it is not mapped
		char decodedCharacter = codedCharacter;
		
		//Check if character is a lower case letter
		if(codedCharacter >= 'a' && codedCharacter <= 'z'){
			
			//Get current position of character
			int codedAlphabeticPosition = codedCharacter - 'a';
			
			//Get the decoded position by offsetting the code position
			int decodedAlphabeticPosition = ( ( codedAlphabeticPosition + (26 - OFFSET) ) % 26 ) + (int)'a';
			
			//Get the character at the decoded position
			decodedCharacter = (char)decodedAlphabeticPosition;
			
		}
		
		//Check if character is a lower case letter
		if(codedCharacter >= 'A' && codedCharacter <= 'Z'){
			
			//Get current position of character
			int codedAlphabeticPosition = codedCharacter - 'A';
			
			//Get the decoded position by offsetting the code position
			int decodedAlphabeticPosition = ( ( codedAlphabeticPosition + (26 - OFFSET) ) % 26 ) + (int)'A';
			
			//Get the character at the decoded position
			decodedCharacter = (char)decodedAlphabeticPosition;
			
		}
		
		//Check if character is a number
		if(codedCharacter >= '0' && codedCharacter <= '9'){
			
			//Get current position of character
			int codedNumericPosition = codedCharacter - '0';
			
			//Get the decoded position by offsetting the code position
			int decodedNumericPosition = ( ( codedNumericPosition + (10 - OFFSET) ) % 10 ) + (int)'0';
			
			//Get the character at the decoded position
			decodedCharacter = (char)decodedNumericPosition;
			
		}
		
		return decodedCharacter;
	}
	
	//------------------------------------------------------------------------------------
	
    /**
     * Gets the encoded list of words.
     * @return String[]: result encoding original list of words
     */
	
	public String[] getEncodedList() {
		
		return encodedList;
		
	}
	
	//------------------------------------------------------------------------------------
	
    /**
     * Gets the decoded list of words.
     * @return String[]: result decoding encoded list of words
     */
	
	public String[] getDecodedList() {
		
		return decodedList;
		
	}
}
 