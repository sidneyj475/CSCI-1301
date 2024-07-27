/*
 * [NetPay].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [6/17/24]
 *
 * Purpose: The purpose of this program is to compute a person's gross 
 * and net pay based on their hourly wage, hours worked, and several withholdings.
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
package NetPay;

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args)
	{
	
	double PAY_PER_HOUR = 7.25; //sets the amount payed per hour of work//
	double FEDERAL_TAX_PERCENT = 0.10; //sets the percentage of federal tax taken out of the gross pay//
	double STATE_TAX_PERCENT = 0.045; //sets the percentage of state tax taken out of the gross pay//
	double SS_PERCENT = 0.062; //sets the percentage of social security taken out of the gross pay//
	double MEDICARE_PERCENT = 0.0145; //sets the percentage of medicare taken out of the gross pay//
	
	Scanner keyboard= new Scanner(System.in); //creates the keyboard scanner//
	
	System.out.print("Hours per Week:\t\t"); //prompts the user to enter how many hours they worked//
    
	double HOURS_PER_WEEK = keyboard.nextInt( ); //gives the user's keyboard input a variable to make later coding more simple//
	double GROSS_PAY = HOURS_PER_WEEK*PAY_PER_HOUR; //calculates the gross pay//
	
	double FEDERAL = GROSS_PAY*FEDERAL_TAX_PERCENT; //calculates the federal tax deduction//
	double STATE = GROSS_PAY*STATE_TAX_PERCENT; //calculates the state tax deduction//
	double SS_DEDUCTION = GROSS_PAY*SS_PERCENT; //calculates the social security deduction//
	double MEDICARE = GROSS_PAY*MEDICARE_PERCENT; //calculates the medicare deduction//
	
	double NET_PAY = GROSS_PAY-FEDERAL-STATE-SS_DEDUCTION-MEDICARE; //calculates the net pay//
	
	//System.out.println("Hours per Week:\t\t"+HOURS_PER_WEEK); //displays the hours per week//
	System.out.println("Gross Pay:\t\t"+GROSS_PAY); //displays the gross pay//
	System.out.println("Net Pay:\t\t"+NET_PAY); //displays the net pay//
	System.out.println(" "); //breaks up the data//
	System.out.println("Deductions"); //introduces the deductions//
	System.out.println("Federal:\t\t"+FEDERAL); //displays the federal deduction//
	System.out.println("State:\t\t\t"+STATE); //displays the state deduction//
	System.out.println("Social Security:\t"+SS_DEDUCTION); //displays the social security deduction//
	System.out.println("Medicare:\t\t"+MEDICARE); //displays the medicare deduction//
	}
}
