/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class VisaElectron extends Card {

	/**No Arg constructor that calls the superclass constructor.
		 * 
		 */
		public VisaElectron() {
			super();
		}
		
		/* This method compares a given string to the qualifications for a Visa Electron card
		 * (non-Javadoc)
		 * @see Card#checkSub(java.lang.String)
		 */
		public boolean checkSub(String s) {						//Receives a string
			boolean valid = false;
			String sub = s.substring(0,6);						//Compares the substring
			
			if(s.length() == 16) {								//To the length
				if(sub.equals("417500")) {						//Compares to a possible value
					addNewValue(s, getValidList());								//In the Issuer IIN Range
					valid = true;
				} else {sub = s.substring(0,4);}				//Compares a new substring
				if(sub.equals("4066") || sub.equals("4508") || 	//To values in the Issuer IIN Range
				   sub.equals("4844") || sub.equals("4913") ||
				   sub.equals("4917")) {
					addNewValue(s, getValidList());
						valid = true;
				}
			}
			return valid;
		}
		
}
