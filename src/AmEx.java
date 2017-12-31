/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class AmEx extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public AmEx() {
		super();
	}
	
	/* This method compares a given string to the qualifications for an American Express card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) { 				//Receives a string
		boolean valid = false;
		String sub = s.substring(0,2);					//Compares the sub string
		if(s.length() == 15) {							//To the length
			if(sub.equals("34") || sub.equals("37")) {	//Then to the starting requirements for
				addNewValue(s, getValidList());			//The Issuer per IIN Range
				valid = true;
			} else {}
		} else {}
		return valid;
	}
}
