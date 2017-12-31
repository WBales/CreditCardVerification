/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class DCInternational extends Card{

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public DCInternational() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a Diners Club International card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {	//Receives a string
		boolean valid = false;
		String sub = s.substring(0,2);	//Compares the substring
		if(s.length() == 14) {			//to the length
			if(sub.equals("36")) {		//Compares to the possible starting values
				addNewValue(s, getValidList());			//of the Issuer per IIN Range
				valid = true;
			} else {}
		} else {}
		return valid;
	}
}
