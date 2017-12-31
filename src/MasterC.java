/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class MasterC extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public MasterC() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a MasterCard card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {					//Receives a string
		boolean valid = false;
		String sub = s.substring(0,2);					//Compares the substring
		
		if(s.length() >= 16 && s.length() <= 19) {		//To the length
			for(int num = 51; num <= 55; num++) {		//Compares to the possible values in the
				if(sub.equals(Integer.toString(num))) {	//Issuer IIN Range
					addNewValue(s, getValidList());
					valid = true;
					}
				}
			}
		return valid;
	}
}
