/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class Visa extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public Visa() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a Visa card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {					//Receives a string
		boolean valid = false;
		String sub = s.substring(0,1);					//Compares the substring
			
			if(s.length() >= 13 && s.length() <= 16) {	//To the length
				if(sub.equals("4")) {					//Compares to the possible values
					addNewValue(s, getValidList());		//of the Issuer IIN Range
					valid = true;
			}
		}
		return valid;
	}
}
