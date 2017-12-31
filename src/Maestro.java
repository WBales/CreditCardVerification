/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class Maestro extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public Maestro() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a Maestro card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {					//Receives a string
		boolean valid = false;
		String sub = s.substring(0,4);					//Compares the substring
		
		if(sub.equals("5018") || sub.equals("5020") || 	//To the possible IIN Range values
		   sub.equals("5038") || sub.equals("5893") ||	//of the Issuer
		   sub.equals("6304") || sub.equals("6759") ||
		   sub.equals("6761") || sub.equals("6762") ||
		   sub.equals("6763")) {
			
			if(s.length() >= 16 && s.length() <= 19) {	//Compares to the possible lengths
				addNewValue(s, getValidList());
				valid = true;
			}
		}
		return valid;
	}
	
}
