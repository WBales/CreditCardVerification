/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class Laser extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public Laser() {
		super();
	}

	/* This method compares a given string to the qualifications for a Laser card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {			//Receives a string
		boolean valid = false;
		String sub = s.substring(0,4);			//Compares the substring
												//To the possible IIN Range values
		if(sub.equals("6304") || sub.equals("6706") || sub.equals("6771") || sub.equals("6709")) {
			if(s.length() >= 16 && s.length() <= 19) {	//Compares to the possible lengths
				addNewValue(s, getValidList());
				valid = true;
			}
		}
		return valid;
	}
	
}
