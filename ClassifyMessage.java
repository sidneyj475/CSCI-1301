/*
 * [ClassifyMessage].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [2/9/24]
 *
 * Purpose: The purpose of this program is to classify message.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */

package ClassifyMessage; 

import java.util.Scanner; //imports scanner

public class ClassifyMessage {
	
		enum MessageCategory {NEED, OFFER, ALERT, INFO, UNKNOWN} //enumeration statement

	public static void main(String[] args)
	{
		String catString; //The raw text of the message’s category
		String payload; //The primary content of the message
		double latitude; //The latitude indicated in the message
		double longitude; //The longitude indicated in the message
		boolean isInRange; //A “flag” indicating whether the latitude and longitude values are within bounds
		MessageCategory message; //The message’s category
		
		
		double south = 39.882343; // southernmost latitude
		double north = 40.231315; // northernmost latitude
		double west = -105.743511; // westernmost longitude
		double east = -104.907864; // easternmost longitude
		
	//prompting statement	
	Scanner keyboard = new Scanner(System.in);
			
		System.out.println("Please enter a formatted message:");
				
			catString = keyboard.next();
				catString.trim();
				
			latitude = keyboard.nextDouble();
			
			longitude = keyboard.nextDouble();
				
			payload = keyboard.nextLine();
				payload.trim();
				
	//multi-branch if-else statement			
	if (catString.equalsIgnoreCase("fire") ||  catString.equalsIgnoreCase("smoke")) {
		message = MessageCategory.ALERT;
			} else if (catString.equalsIgnoreCase("need")) {
				message = MessageCategory.NEED;
			} else if (catString.equalsIgnoreCase("offer")) {
				message = MessageCategory.OFFER;
			} else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("road") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
				message = MessageCategory.INFO;
			} else {
				message = MessageCategory.UNKNOWN;
				}
				
	//conditional statements				
	if (((latitude >= south) && (latitude <= north)) && ((longitude >= west) && (longitude <= east))) {
		isInRange = true;
			} else {
				isInRange = false;
					}
				
	//outputs
	System.out.println("Category:\t " + message);
	System.out.println("Raw Cat:\t " + catString);
	System.out.println("Message:\t" + payload);
	System.out.println("Latitude:\t " + latitude);
	System.out.println("Longitude:\t " + longitude);
	System.out.println("In Range:\t " + isInRange);
		
		
		
		
}
}
