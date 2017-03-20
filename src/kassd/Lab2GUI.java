/*
*Course: SE-1011-001
*Term: Winter 2010-2011
*Assignment: Lab 2
*Author: Dan Kass
*Date: 12/14/2010
*/
package kassd;

import javax.swing.JOptionPane;

public class Lab2GUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
// The type of letter being sent
		String letter;
// Weight in ounces of package
		double weight;
		
// Input the type of letter
		letter = JOptionPane.showInputDialog("What are you mailing today? A Letter, a LargeEnvelope, or a Package?");
		
//Prices for sending a letter
		if (letter.equalsIgnoreCase("Letter")){
			
// Input the weight in ounces for the letter
		weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight in ounces?"));

			if (weight < 0){
				JOptionPane.showMessageDialog(null, "Not a Vaild Weight");
			}
			else if (weight <= 1){
				JOptionPane.showMessageDialog(null, "Your Cost will be $0.44 to mail your letter.");
			}
			else if (weight <= 2){
				JOptionPane.showMessageDialog(null, "Your Cost will be $0.61 to mail your letter.");
			}
			else if (weight <= 3){
				JOptionPane.showMessageDialog(null, "Your Cost will be $0.78 to mail your letter.");
			}
			else if (weight <= 3.5){
				JOptionPane.showMessageDialog(null, "Your Cost will be $0.95 to mail your letter.");
			}
			else{
				JOptionPane.showMessageDialog(null, "Not a Valid Weight.");
			}
		}
	
//Prices for sending a large envelope
		else if (letter.equalsIgnoreCase("LargeEnvelope")){
			
// Input the weight in ounces for the large envelope
		weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight in ounces?"));

			if (weight < 0){
				JOptionPane.showMessageDialog(null, "Not a Vaild Weight");
			}
			else if (weight <= 1){
				JOptionPane.showMessageDialog(null, "Your Cost will be $0.88 to mail your large envlope.");
			}
			else if (weight <= 2){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.05 to mail your large envlope.");
			}
			else if (weight <= 3){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.22 to mail your large envlope.");
			}
			else if (weight <= 4){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.39 to mail your large envlope.");
			}
			else if (weight <= 5){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.56 to mail your large envlope.");
			}
			else if (weight <= 6){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.73 to mail your large envlope.");
			}
			else if (weight <= 7){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.90 to mail your large envlope.");
			}
			else if (weight <= 8){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.07 to mail your large envlope.");
			}
			else if (weight <= 9){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.24 to mail your large envlope.");
			}
			else if (weight <= 10){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.41 to mail your large envlope.");
			}
			else if (weight <= 11){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.58 to mail your large envlope.");
			}
			else if (weight <= 12){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.75 to mail your large envlope.");
			}
			else if (weight <= 13){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.92 to mail your large envlope.");
			}
			else{
				JOptionPane.showMessageDialog(null, "Not a Valid Weight.");
			}	
		}
		
//prices for sending a package
		else if (letter.equalsIgnoreCase("Package")){
			
// Input the weight in ounces for the package
			weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight in ounces?"));
			
			if (weight < 0){
				JOptionPane.showMessageDialog(null, "Not a Vaild Weight");
			}
			else if (weight <= 1){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.22 to mail your package.");
			}
			else if (weight <= 2){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.39 to mail your package.");
			}
			else if (weight <= 3){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.56 to mail your package.");
			}
			else if (weight <= 4){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.73 to mail your package.");
			}
			else if (weight <= 5){
				JOptionPane.showMessageDialog(null, "Your Cost will be $1.90 to mail your package.");
			}
			else if (weight <= 6){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.07 to mail your package.");
			}
			else if (weight <= 7){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.24 to mail your package.");
			}
			else if (weight <= 8){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.41 to mail your package.");
			}
			else if (weight <= 9){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.58 to mail your package.");
			}
			else if (weight <= 10){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.75 to mail your package.");
			}
			else if (weight <= 11){
				JOptionPane.showMessageDialog(null, "Your Cost will be $2.92 to mail your package.");
			}
			else if (weight <= 12){
				JOptionPane.showMessageDialog(null, "Your Cost will be $3.09 to mail your package.");
			}
			else if (weight <= 13){
				JOptionPane.showMessageDialog(null, "Your Cost will be $3.26 to mail your package.");
			}
			else{
				JOptionPane.showMessageDialog(null, "Not a Valid Weight.");
			}
		}
		
// If a Vaild Letter is not inputed		
		else{
			JOptionPane.showMessageDialog(null, "Not a Vaild Package");
		}

	}

}
