/**
*Description:Exception handler class the returns the sent string.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class ExceptionHandler extends Exception{

	/**
	 * @param m - The string that will be returned by this exception
	 */
	public ExceptionHandler (String m) { //utilizes super method and returns the original message that was sent
		super(m);
	}
}
