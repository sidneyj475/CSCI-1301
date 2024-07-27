/*
 * [PayoffDebt].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [6/26/24]
 *
 * Purpose: The purpose of this program is to compute the number of months required to pay a debt. It also computes the t
 * total amount paid to the credit card company, interest paid, and overpayment.
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


import java.lang.Math;

import java.util.Scanner;

public class PayoffDebt {

	public static void main(String[] args)
	{
	
	Scanner keyboard= new Scanner(System.in); //creates the keyboard scanner//
		
			System.out.print("Principal:\t\t\t"); //prompts the user to enter their principal amount//
				double PRINCIPAL = keyboard.nextDouble(); //gives the principal input a variable to make later coding more simple//
		
			System.out.print("Annual Interest Rate (%):\t"); //prompts the user to enter their annual rate//
				double annualInterest = keyboard.nextDouble(); //gives the annual interest input a variable to make later coding more simple//
			
			System.out.print("Monthly Payment:\t\t"); //prompts the user to enter their monthly payment//
				double MONTHLY = keyboard.nextDouble(); //gives the monthly payment input a variable to make later coding more simple//
	
	double MONTHSNEEDED = ((Math.log(MONTHLY)-Math.log(MONTHLY-(annualInterest/1200.0)*PRINCIPAL))/(Math.log((annualInterest/1200.0)+1.0))); //months needed to pay off the principal//
		int MONTHSNEEDED2 = (int)Math.ceil(MONTHSNEEDED); //rounds the months needed 
	
	double totalAmount = MONTHLY*MONTHSNEEDED2; //calculates the total amount that will be paid//
		double roundedTotalAmount = (double)Math.round(totalAmount*100)/100;//rounds the total amount to two decimal places
	
	double TOTALINT = totalAmount-PRINCIPAL; //calculates the total interest paid//
		double roundedTotalInt = (double)Math.round(TOTALINT*100)/100;//rounds the total interest to two decimal places
	
	//calculates the overpayment by subtracting the rounded monthsneeded method by the unrounded monthsneeded method-
	//then multiplying the difference by the monthly payment
	double OVERPAY = (((MONTHSNEEDED2-MONTHSNEEDED)*(MONTHLY)));
		double roundedOverpay = (double)Math.round(OVERPAY*100)/100; //rounds the overpayment to two decimal places
		
			System.out.println(" "); //breaks up the data//
		
		System.out.println("Months Needed to Pay Off:\t"+MONTHSNEEDED2); //displays the rounded monthsneeded//
		
		System.out.println("Total Amount Paid:\t\t$"+roundedTotalAmount); //displays the rounded total amount//
		
		System.out.println("Total Interest Paid:\t\t$"+roundedTotalInt); //displays the rounded total interest paid//
		
		System.out.println("Overpayment:\t\t\t$"+roundedOverpay); //displays the rounded overpayment//
	}
}
