/*
*Course: SE-1011-001
*Term: Winter 2010-2011
*Assignment: Lab 2
*Author: Dan Kass
*Date: 12/14/2010
*/
package kassd;

import java.util.Scanner;


public class Lab2Console {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner (System.in);
// For what type of Letter
		String letter;
// For the weight of the Letter in ounces
		Double weight;
		System.out.print("What are you mailing today? A Letter, a LargeEnvelope, or a Package?");
		letter = stdIn.nextLine();
		
//Prices for sending a letter
		if (letter.equalsIgnoreCase("Letter")){
			
// Input the weight in ounces for the letter
		System.out.print("What is the weight in ounces?");
		weight = stdIn.nextDouble();
		
			if (weight < 0){
				 System.out.println("Not a Vaild Weight");
			}
			else if (weight <= 1){
				System.out.println("Your Cost will be $0.44 to mail your letter.");
			}
			else if (weight <= 2){
				System.out.println("Your Cost will be $0.61 to mail your letter.");
			}
			else if (weight <= 3){
				System.out.println("Your Cost will be $0.78 to mail your letter.");
			}
			else if (weight <= 3.5){
				System.out.println("Your Cost will be $0.95 to mail your letter.");
			}
			else{
				System.out.println("Not a Valid Weight.");
			}
		}
		
//Prices for sending a large envelope
		else if (letter.equalsIgnoreCase("LargeEnvelope")){
			
// Input the weight in ounces for the large envelope
			System.out.print("What is the weight in ounces?");
			weight = stdIn.nextDouble();
			
			if (weight < 0){
				System.out.println("Not a Vaild Weight");
			}
			else if (weight <= 1){
				System.out.println("Your Cost will be $0.88 to mail your large envlope.");
			}
			else if (weight <= 2){
				System.out.println("Your Cost will be $1.05 to mail your large envlope.");
			}
			else if (weight <= 3){
				System.out.println("Your Cost will be $1.22 to mail your large envlope.");
			}
			else if (weight <= 4){
				System.out.println("Your Cost will be $1.39 to mail your large envlope.");
			}
			else if (weight <= 5){
				System.out.println("Your Cost will be $1.56 to mail your large envlope.");
			}
			else if (weight <= 6){
				System.out.println("Your Cost will be $1.73 to mail your large envlope.");
			}
			else if (weight <= 7){
				System.out.println("Your Cost will be $1.90 to mail your large envlope.");
			}
			else if (weight <= 8){
				System.out.println("Your Cost will be $2.07 to mail your large envlope.");
			}
			else if (weight <= 9){
				System.out.println("Your Cost will be $2.24 to mail your large envlope.");
			}
			else if (weight <= 10){
				System.out.println("Your Cost will be $2.41 to mail your large envlope.");
			}
			else if (weight <= 11){
				System.out.println("Your Cost will be $2.58 to mail your large envlope.");
			}
			else if (weight <= 12){
				System.out.println("Your Cost will be $2.75 to mail your large envlope.");
			}
			else if (weight <= 13){
				System.out.println("Your Cost will be $2.92 to mail your large envlope.");
			}
			else{
				System.out.println("Not a Valid Weight.");
			}	
		}		
		
//prices for sending a package
		else if (letter.equalsIgnoreCase("Package")){
			
// Input the weight in ounces for the package
			System.out.print("What is the weight in ounces?");
			weight = stdIn.nextDouble();
			
			if (weight < 0){
				System.out.println("Not a Vaild Weight");
			}
			else if (weight <= 1){
				System.out.println("Your Cost will be $1.22 to mail your package.");
			}
			else if (weight <= 2){
				System.out.println("Your Cost will be $1.39 to mail your package.");
			}
			else if (weight <= 3){
				System.out.println("Your Cost will be $1.56 to mail your package.");
			}
			else if (weight <= 4){
				System.out.println("Your Cost will be $1.73 to mail your package.");
			}
			else if (weight <= 5){
				System.out.println("Your Cost will be $1.90 to mail your package.");
			}
			else if (weight <= 6){
				System.out.println("Your Cost will be $2.07 to mail your package.");
			}
			else if (weight <= 7){
				System.out.println("Your Cost will be $2.24 to mail your package.");
			}
			else if (weight <= 8){
				System.out.println("Your Cost will be $2.41 to mail your package.");
			}
			else if (weight <= 9){
				System.out.println("Your Cost will be $2.58 to mail your package.");
			}
			else if (weight <= 10){
				System.out.println("Your Cost will be $2.75 to mail your package.");
			}
			else if (weight <= 11){
				System.out.println("Your Cost will be $2.92 to mail your package.");
			}
			else if (weight <= 12){
				System.out.println("Your Cost will be $3.09 to mail your package.");
			}
			else if (weight <= 13){
				System.out.println("Your Cost will be $3.26 to mail your package.");
			}
			else{
				System.out.println("Not a Valid Weight.");
			}
		}
		
// If a Vaild Letter is not inputed		
		else{
			System.out.println("Not a Vaild Package");
		}
	}
}