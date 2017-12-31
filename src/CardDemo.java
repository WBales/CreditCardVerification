import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
*Description:CardDemo that utilizes the Superclass Card, the available subclasses, and the custom ExceptionHandler
*to process, verify, sort, and store a received file of possible credit card numbers.
*Final Project
*Date: 12/3/2017
*@author  Wes Bales
*@version 0.0.1
*/
public class CardDemo {
	
	public static void main(String args[]) {
		
		String inputFileName = args[0];
		String outputValidFileName = args[1];
		String outputInvalidFileName = args[2];
		String line;
		
		try { //Construct the necessary utility objects
			Card card = new Card(0);
			FileReader inputFile = new FileReader(inputFileName);
			BufferedReader fileBuffer = new BufferedReader(inputFile);
			PrintWriter outputFile = new PrintWriter(new FileOutputStream(outputValidFileName));
			PrintWriter outputInvalidFile = new PrintWriter(new FileOutputStream(outputInvalidFileName));
			Scanner kyb = new Scanner(System.in);		
			
			try {	// Asks the user a question		
					throw new ExceptionHandler("What is todays date?");
				}
				catch (ExceptionHandler e){
					System.out.println(e.getMessage());
				}
			String input = kyb.nextLine(); //Receives the user input
											//Intentionally doesn't use it or verify
			// Using Math Class
			Math.sqrt(25);
			
			Card amEx = new AmEx(); 						//Create all of the sub
			Card blanche = new DCCBlanche(); 			// objects that inherit from Card.
			Card dcInt = new DCInternational(); 	// These will be used to store sorted
			Card usaCan = new DCUsaCanada();  		// information.
			Card disc = new Discover();
			Card instP = new InstaPay();
			Card jcb = new JCB();
			Card laser = new Laser();
			Card maestro  = new Maestro();
			Card mC = new MasterC();
			Card visa = new Visa();
			Card visaE = new VisaElectron();
			
			//Read the input file. Verifies validity of data, length, and Luhns before storing in data file.
			//If it fails, the line is stored in the invalid file.
			while((line = fileBuffer.readLine()) != null){
				
				if(card.hasValidCharacters(line) != true) {
					card.addNewValue(line, card.getInvalidDataList());
				} else if(card.isValidLength(line) == true && card.isValidLuhn(line) == true) {
					card.addNewValue(line, card.getDataList());
				} else {
					card.addNewValue(line, card.getInvalidList());
				}
			}
			
			//Sorts the data values into the subclass valid lists
			for(int index = 0; card.sizeOfList(card.getDataList()) - 1 > index; index++) {	
				String data = card.getValue(index, card.getDataList());

							if(amEx.checkSub(data) == true) {
						continue;
					} else if(blanche.checkSub(data) == true) {
						continue;
					} else if(dcInt.checkSub(data) == true) {
						continue;
					} else if(usaCan.checkSub(data) == true) {
						continue;
					} else if(disc.checkSub(data) == true) {
						continue;
					} else if(instP.checkSub(data) == true) {
						continue;
					} else if(jcb.checkSub(data) == true) {
						continue;
					} else if(laser.checkSub(data) == true) {
						continue;
					} else if(maestro.checkSub(data) == true) {
						continue;
					} else if(mC.checkSub(data) == true) {
						continue;
					} else if(visa.checkSub(data) == true) {
						continue;
					} else if(visaE.checkSub(data) == true) {
						continue;
					} else {card.addNewValue(data, card.getInvalidList());}
			
			}
			//card.testLuhns();
			
			//Using exception handling to output to the files.
			try {					
				throw new ExceptionHandler("Valid American Express:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: amEx.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid Diners Club - Carte Blanche:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: blanche.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid Diners Club - International:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: dcInt.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
		
			try {					
				throw new ExceptionHandler("Valid Diners Club USA & Canada:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: usaCan.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
		
			try {					
				throw new ExceptionHandler("Valid Discover:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: disc.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid InstaPayment:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: instP.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid JCB:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: jcb.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}

			try {					
				throw new ExceptionHandler("Valid Laser:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: laser.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid Maestro:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: maestro.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid MasterCard:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: mC.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid Visa:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: visa.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Valid Visa Electron:");
			}
			catch (ExceptionHandler e){
				outputFile.println(e.getMessage());
				for(String array: visaE.getValidList()) {
					outputFile.println(array);
				} outputFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Invalid Numbers:");
			}
			catch (ExceptionHandler e){
				outputInvalidFile.println(e.getMessage());
				for(String array: card.getInvalidList()) {
					outputInvalidFile.println(array);
				} outputInvalidFile.println();
			}
			
			try {					
				throw new ExceptionHandler("Invalid Data:");
			}
			catch (ExceptionHandler e){
				outputInvalidFile.println(e.getMessage());
				for(String array: card.getInvalidDataList()) {
					outputInvalidFile.println(array);
				} outputInvalidFile.println();
			}
			
			//System.out.println("Test");
			//Close utilities
			kyb.close();
			fileBuffer.close();
			outputFile.close();
			outputInvalidFile.close();
			
			
		} catch (IOException e) {
			System.out.println("That is not a valid file.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Did not parse line correctly.");
			e.printStackTrace();
		}
		System.exit(0);
	}
}
