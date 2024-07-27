/*
 * [ParseTheTweet].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [6/24/24]
 *
 * Purpose: The purpose of this program is to use methods of the String class to process messages similar to TtT tweets
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

import java.util.Scanner;

public class ParseTheTweet {

	private static final String String = null;

	public static void main(String[] args)
	{
		
		Scanner keyboard= new Scanner(System.in); //creates the keyboard scanner//
		
			System.out.println("Enter a tweet below:"); //prompts the user to enter their tweet of choice//
		
				String tweet = keyboard.nextLine( ); //gives the user's keyboard input a variable to make later coding more simple//
		 
		String type = "#typ"; //creates type method
		
		String location = "#loc"; //creates location method
		
		String detail = "#det"; //creates detail method
		
		String latitude = "#lat"; //creates latitude method
		
		String longitude = "#lng"; //creates longitude method
		
		int start; //creates start method
		int finish; //creates finish method
		
			//finds the indexes and substring of type
			start = tweet.indexOf(type) + 4;
			finish = tweet.indexOf("; #det");
			String typeTrim = tweet.substring(start, finish);
			
			//finds the indexes and substring of location
			start = tweet.indexOf(location) + 4;
			finish = tweet.indexOf("; #lat");
			String locationTrim = tweet.substring(start, finish);
			
			//finds the indexes and substring of detail
			start = tweet.indexOf(detail) + 4;
			finish = tweet.indexOf("; #loc");
			String detailTrim = tweet.substring(start, finish);
			
			//finds the indexes and substring of latitude
			start = tweet.indexOf(latitude) + 4;
			finish = tweet.indexOf("; #lng");
			String latitudeTrim = tweet.substring(start, finish);
			
			//finds the indexes and substring of longitude
			start = tweet.indexOf(longitude) + 4;
			finish = tweet.indexOf(";\"");
			String longitudeTrim = tweet.substring(start, finish);
			
		//outputs
		System.out.println("Type:\t\t" + typeTrim.toUpperCase());
		
		System.out.println("Detail:\t\t" + detailTrim.replace(',', '-'));
		
		System.out.println("Location:\t" + locationTrim.replace(',', '-'));
		
		System.out.println("Latitude:\t " + latitudeTrim.trim());
		
		System.out.println("Longitude:\t " + longitudeTrim.trim());
	}

}
