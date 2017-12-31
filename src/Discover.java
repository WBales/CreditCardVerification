/**
*Description:Subclass of Card that contains a method that overrides the super method. It determines if it belongs to this subclass
*issuer.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class Discover extends Card{

	/**No Arg constructor that calls the superclass constructor.
	 * 
	 */
	public Discover() {
		super();
	}
	
	/* This method compares a given string to the qualifications for a Discover card
	 * (non-Javadoc)
	 * @see Card#checkSub(java.lang.String)
	 */
	public boolean checkSub(String s) {			//Receives a string
		boolean valid = false;
		if(s.length() == 16) {					//Compares the length of the string
			
		 while(!valid) {						//Runs until a match is found or all conditions have been disqualified.
				String sub = s.substring(0,2);	//Compares substring
				if(sub.equals("65")) {			//To IIN Range possibility
					addNewValue(s, getValidList());			
					valid = true;
				}
				if (valid) {
					break;
				}
				
				sub = s.substring(0,4);		//Compares substring
				if(sub.equals("6011")) {	//To IIN Range possibility
					addNewValue(s, getValidList());			
					valid = true;
				}
				if (valid) {
					break;
				}
				
				sub = s.substring(0,3);						//Compares substring
				for(int num = 644; num <= 649; num++) {		//To range of possible IIN Range
					if(sub.equals(Integer.toString(num))) {
						addNewValue(s, getValidList());			
						valid = true;
					}
				}
				if (valid) {
					break;
				}
				
				sub = s.substring(0,6);														//Compares substring
				if(Integer.parseInt(sub) >= 622126 && Integer.parseInt(sub) <= 622925) {	//Only if it will find a match
							addNewValue(s, getValidList());		
							valid = true;
				}
				
				if (!valid) {
					break;
				}
		 	}
		}
		return valid;
	}
}