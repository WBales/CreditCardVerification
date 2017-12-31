import java.util.ArrayList;
/**
*Description:Card superclass that is able to verify, sort, receive, and modify data storage locations for a given starting list
*valid list, and invalid lists of information. 
*Credit Card Verification
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class Card {
	
	int number;
	private ArrayList<String>dataList = new ArrayList<String>(); 			//List of data from input file
	private static ArrayList<String>invalidList = new ArrayList<String>();	//List of all invalid data
	private ArrayList<String>validList = new ArrayList<String>();			//Unused in superclass--
	private ArrayList<String>invalidDataList = new ArrayList<String>();			//List of data that contained invalid characters															//--Valid data in subclasses
	
	/**No arg constructor for the superclass
	 * 
	 */
	public Card() { //No arg constructor
		
	}
	
	/**Constructor that receives a parameter of the type integer.
	 * @param s - an Integer value that will be stored in the currently unused number field.
	 */
	public Card(int s) { //Overloaded constructor 
		number = s;
	}
	
	/** Method that adds new values to the specified list
	 * @param s - String that is to be added to the list
	 * @param l - List that the string parameter is to be added to
	 */
	public void addNewValue(String s, ArrayList<String> l) {
		l.add(s);	
	}
	
	/** Method that returns a value in a list at a specified location
	 * @param s - index value in the list to be returned
	 * @param l - list that contains the value needed
	 * @return A string value at index value s in the list l
	 */
	public String getValue(int s, ArrayList<String> l) {
		return l.get(s);
	}
	
	/** Method that returns the size of a list
	 * @param l - The list whose size will be returned
	 * @return An integer value for the size of list l
	 */
	public int sizeOfList(ArrayList<String> l) {
		return l.size();
	}
	
	/** Method that returns the entire dataList
	 * @return - An ArrayList object for the dataList
	 */
	public ArrayList<String> getDataList () { //Gets dataList
		return dataList;
	}
	
	/** Method that returns the entire invalidList
	 * @return - An ArrayList object for the invalidList
	 */
	public ArrayList<String> getInvalidList () { //Gets invalidList
		return invalidList;
	}
	
	/** Method that returns the entire validList
	 * @return - An ArrayList object for the validList
	 */
	public ArrayList<String> getValidList () { //Gets validList
		return validList;
	}
	
	/** Method that returns the entire invalidDataList
	 * @return - An ArrayList object for the invalidDataList
	 */
	public ArrayList<String> getInvalidDataList () { //Gets invalidDataList
		return invalidDataList;
	}
	
	/**Method that checks the data for unacceptable characters
	 * @param s - String value to be verified
	 * @return	- Boolean value based on containing acceptable characters
	 */
	public boolean hasValidCharacters(String s) {				//Receives a string value
		boolean valid = false;
		
		try {
		long testForNonDigits = new Long(s);					//verifies the value contains acceptable digits
		valid = true;
		
		} catch(NumberFormatException e) {									//Catch portion of the invalid
			System.out.println(s + " contained invalid data.");				//data exception
			return valid;
		}
		return valid;
	}
	
	/**This method has no use in the superclass. Overwritten in each subclass. Each subclass method contains
	 * the valid IIN Range information per each card Issuer
	 * @param s - String value to be compared to the IIN Range
	 * @return - Returns a boolean based on if it found a match
	 */
	public boolean checkSub(String s) { //This method is overloaded
		boolean valid = false;			//In each subclass
		return valid;
	}
	
	/** The method verifies the length of each data entry to be within all acceptable IIN Range values
	 * @param s - String value to be verified
	 * @return - A boolean based on an acceptable data length.
	 */
	public boolean isValidLength(String s) { // Verifies the length is between 13 and 19 before
		boolean valid = false;					// attempting to process the data.
		if(s.length() >= 13 && s.length() <=19) {
			valid = true;
		} else {}
		return valid;
	}
	
	/*public void testLuhns() {  //Method used to test the Luhns algorithm
		for(Long index: dataList) {
			
			if(isValidLuhn(index) == true) {
				addNewValid(index);
			} else if(isValidLuhn(index) == false) {
				addNewInvalid(index);
			}
			
		}
	}*/
	
	/** This method verifies if the given value passes Luhn's Algorithm and might be a possible card number
	 * @param s - String value to be applied to Luhn's Algorithm
	 * @return - Boolean value based on successfully passing Luhn's Algorithm.
	 */
	public boolean isValidLuhn(String s) {  // Tests a given string of digits to pass or fail
		boolean valid = false;				// Luhn's Algorithm for credit cards
		char ch;
		StringBuilder line = new StringBuilder(s);
			
		int lastDig = Character.getNumericValue(line.charAt(line.length()-1));	// Saves last digit
		line.deleteCharAt(line.length()-1);										// Removes last digit
		line.reverse();															//Reverses the strings value
		
		int sum; int value; 													//Multiplies odd values by two
		for(int index = 0; index < line.length(); index += 2) {
			sum = 0; value = 0; 												//reset values
			
			ch = line.charAt(index);
			value = Character.getNumericValue(ch);
			value = value*2;
			
			int length = String.valueOf(value).length();						//gets length of the value
			
			if(length == 2) { 													//If two digits, adds them together.
				while(value > 0) {
					sum = sum + value % 10;
					value = value / 10;
				}																//Only uses this if this index in the 
				ch = Integer.toString(sum).charAt(0);							//string is now two characters long
			} else {ch = Integer.toString(value).charAt(0);}					
			
			
			line.setCharAt(index, ch);											//Replaces odd digits
		}
			value = 0; sum = 0; //reset values
			for(int index2 = 0; index2 < line.length(); index2 ++) {			//This portion sums
				ch = line.charAt(index2);										//The digits of the 
				value = Character.getNumericValue(ch);							//String
				sum += value;
			}
		
		if((sum + lastDig)%10 == 0) {											//Checks if the sum
			valid = true;														//Plus the last digit
		} else {}																//%10 is 0
		
		return valid;
	}
		
}
	

	

