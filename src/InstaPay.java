/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class InstaPay extends Card {

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public InstaPay() {
		super();
	}
	
	/* This method compares a given string to the qualifications for an InstaPay card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {						//Receives a string
		boolean valid = false;				
		String sub = s.substring(0,3);						//Compares the substring
			if(s.length() == 16) {							//to the length
				for(int num = 637; num <= 639; num++) {		//Compares to the possible values
					if(sub.equals(Integer.toString(num))) {	//in the Issuer IIN Range
						addNewValue(s, getValidList());	
						valid = true;
					}
				}
			}
		return valid;
	}
	
}
