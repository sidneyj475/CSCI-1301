/*
 * [StringFun].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [3/15/24]
 *
 * Purpose: To create an environment where the user can enter a 
 * sentence as a string and then manipulate that string using 5 basic commands. 
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

public class StringFun {

	public static void main(String[] args) {
		
		// creating a new scanner
        Scanner keyboard = new Scanner(System.in);

        //variable that is true until the user wishes to quit
        boolean signal = true;
        
        // asks for string
        System.out.println("Enter the string to be manipulated");  
        String input = keyboard.nextLine();
        String message = input;

      
        while (signal) {

            // asks for a command
            System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
            String command = keyboard.nextLine();

            // if command isn't valid, error is returned
            if (!command.equalsIgnoreCase("quit") && !command.equalsIgnoreCase("reverse") && !command.equalsIgnoreCase("replace first") && !command.equalsIgnoreCase("replace last") && !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("remove all")) {
                System.out.println("Command invalid. Try again");
            }
            else {

                // ends the program
                if (command.equalsIgnoreCase("quit")) {
                    signal = false;
                }
                else {

                    // calls the preverse method, defined below
                    if (command.equalsIgnoreCase("reverse")) {
                        System.out.println(reverse(message));
                    }
        
                    // calls the repall method
                    else if (command.equalsIgnoreCase("replace first")) {
                        System.out.println("Enter the character to replace");
                        String blank = keyboard.nextLine();
                        char oldChar = blank.charAt(0);
            
                        // checks if the char input is valid
                        int count = 0;
                        for (int i = 0; i < input.length(); i++) {
                            if (input.charAt(i) == oldChar) {
                                count += 1;
                            }
                        }
                        if (count > 0) {
                            System.out.println("Enter the new character");
                            blank = keyboard.nextLine();
                            char newChar = blank.charAt(0);
                            input = repfirst(input, oldChar, newChar);
                            System.out.println("The new string is: " + input);
                        }
                        else {
                            System.out.println("The letter was not found in the word");
                        }
                    }
                 
                    //remove method
                    else {
                        System.out.println("Enter the character to remove");
                        String blank = keyboard.nextLine();
                        char oldChar = blank.charAt(0);
                        input = removall(input, oldChar);
                        System.out.println("The new string is: " + input);
                    }
                }

            }

        }
    }

    // method to reverse
    public static String reverse(String message) {
        int N = message.length();
        String newMessage = "";
        for (int i = N-1; i >= 0; i--) {
            newMessage += message.charAt(i);
            
        }
        message = ("");
        message = newMessage;
        return message;
    }

    // method to replace first instance of a character
    public static String repfirst(String message, char oldChar, char newChar) {
        int N = message.length();
        String newMessage = "";
        for (int i = 0; i < N; i++) {
            if (message.charAt(i) == oldChar) {
                newMessage += newChar;
            }
            else {
                newMessage += message.charAt(i);
            }
        }
        return newMessage;
    }

    // method to remove all instances of a char
    public static String removall(String message, char removChar) {
        int N = message.length();
        String newMessage = "";
        for (int i = 0; i < N; i++) {
            if (message.charAt(i) == removChar) {
                continue;
            }
            else {
                newMessage += message.charAt(i);
            }
        }
        return newMessage;
    } 


	}

