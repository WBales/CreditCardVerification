/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class JCB extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public JCB() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a JCB card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {					//Receives a string
		boolean valid = false;
		String sub = s.substring(0,4);					//Compares the substring
		
		if(s.length() == 16) {							//To the length
			if(Integer.parseInt(sub) >= 3528 && Integer.parseInt(sub) <= 3589) {	//Only if in-between IIN Range.
				addNewValue(s, getValidList());							//Compares to the possible values
				valid = true;											//of the Issuer IIN Range		
					
				}
			}
		return valid;
	}
	
}
