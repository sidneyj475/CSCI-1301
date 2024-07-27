/*
 * [RockPaperScissors].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [7/9/24]
 *
 * Purpose: To implement a version of Rock, Paper, Scissors where the user plays against a computer.
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

public class RockPaperScissors {
	
    public static void main(String[] args) {
    	
        Scanner keyboard = new Scanner(System.in);

        // initialize variables and take inputs
        System.out.print("Points to win: ");
        int pointsToWin = keyboard.nextInt();
        int compPoints = 0, playerPoints = 0;
        int inputValue;

        // loop for taking input and stopping when there is a winner
        while (!(pointsToWin == compPoints || pointsToWin == playerPoints)) {
            System.out.print("Rock, paper, or scissors? ");
            String strInput = keyboard.next();
            String computerMove = ComputerOpponent.getMove();

            if (strInput.equalsIgnoreCase("rock")) {
                if (computerMove.equals("rock")) {
                    System.out.println("The computer chose rock, so it's a tie. (" + playerPoints + "-" + compPoints + ")");
                } else if (computerMove.equals("paper")) {
                    compPoints++;
                    System.out.println("The computer chose paper, so you lose. (" + playerPoints + "-" + compPoints + ")");
                } else {
                    playerPoints++;
                    System.out.println("The computer chose scissors, so you win! (" + playerPoints + "-" + compPoints + ")");
                }
            } else if (strInput.equalsIgnoreCase("paper")) {
                if (computerMove.equals("rock")) {
                    playerPoints++;
                    System.out.println("The computer chose rock, so you win! (" + playerPoints + "-" + compPoints + ")");
                } else if (computerMove.equals("paper")) {
                    System.out.println("The computer chose paper, so it's a tie. (" + playerPoints + "-" + compPoints + ")");
                } else {
                    compPoints++;
                    System.out.println("The computer chose scissors, so you lose. (" + playerPoints + "-" + compPoints + ")");
                }
            } else if (strInput.equalsIgnoreCase("scissors")) {
                if (computerMove.equals("rock")) {
                    compPoints++;
                    System.out.println("The computer chose rock, so you lose. (" + playerPoints + "-" + compPoints + ")");
                } else if (computerMove.equals("paper")) {
                    playerPoints++;
                    System.out.println("The computer chose paper, so you win! (" + playerPoints + "-" + compPoints + ")");
                } else {
                    System.out.println("The computer chose scissors, so it's a tie. (" + playerPoints + "-" + compPoints + ")");
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        }

        if (playerPoints == pointsToWin) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. Better luck next time!");
        }
    }
}

