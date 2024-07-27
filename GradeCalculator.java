/*
 * [GradeCalculator].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  {7/10/24]
 *
 * Purpose: To apply my knowledge of what we've covered in the course up to this point.
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

public class GradeCalculator {

	public static void main(String[] args) {

		// array used to store weights and known scores
		double[][] weightsAndGrades = new double[2][7];
		double score = 0;
		double totalKnownGradeWeight = 0;
		char currentLetterGrade, letterGrade;
		double finalOverallScore;

		// prints grading scale
		System.out.println("Grading Scale:");
		System.out.println("A\t90 - 100");
		System.out.println("B\t80 - 89");
		System.out.println("C\t70 - 79");
		System.out.println("D\t60 - 69");
		System.out.println("F\tbelow 60");
		System.out.print("What letter grade do you want to achieve for the course?");

		// creates a new scanner object
		Scanner keyboard = new Scanner(System.in);

		// reads in wanted letter grade
		letterGrade = keyboard.findInLine(".").charAt(0);

		// checks entered grade is valid
		if (letterGrade != 'A' && letterGrade != 'B' && letterGrade != 'C' && letterGrade != 'D'
				&& letterGrade != 'F') {
			System.out.println("The input is invalid.");
		} else {

			// uses scanner to read in grade weights
			System.out.println("Enter percentage weights below.");
			System.out.print("Exam 1:\t\t");
			weightsAndGrades[0][0] = keyboard.nextDouble();
			System.out.print("Exam 2:\t\t");
			weightsAndGrades[0][1] = keyboard.nextDouble();
			System.out.print("Final Exam:\t");
			weightsAndGrades[0][2] = keyboard.nextDouble();
			System.out.print("Labs:\t\t");
			weightsAndGrades[0][3] = keyboard.nextDouble();
			System.out.print("Projects:\t");
			weightsAndGrades[0][4] = keyboard.nextDouble();
			System.out.print("Participation:\t");
			weightsAndGrades[0][5] = keyboard.nextDouble();
			System.out.print("Quizzes:\t");
			weightsAndGrades[0][6] = keyboard.nextDouble();

			// if weights don't add to 100, returns error message
			if ((weightsAndGrades[0][0] + weightsAndGrades[0][1] + weightsAndGrades[0][2] + weightsAndGrades[0][3]
					+ weightsAndGrades[0][4] + weightsAndGrades[0][5] + weightsAndGrades[0][6]) != 100) {
				System.out.print("Weights don't add up to 100, program exiting...");
			} else {

				// uses scanner to ask if grades are known and their values
				System.out.print("Do you know your exam 1 score?");
				String hasExamOne = keyboard.next();
				if (hasExamOne.equalsIgnoreCase("yes") || hasExamOne.equalsIgnoreCase("y")) {
					System.out.print("Score received on exam 1:");
					weightsAndGrades[1][0] = keyboard.nextDouble();
					System.out.print("Do you know your exam 2 score?");
					String hasExamTwo = keyboard.next();
					if (hasExamTwo.equalsIgnoreCase("yes") || hasExamTwo.equalsIgnoreCase("y")) {
						System.out.print("Score received on exam 2:");
						weightsAndGrades[1][1] = keyboard.nextDouble();
						System.out.print("Do you know your final exam score?");
						String hasFinal = keyboard.next();
						if (hasFinal.equalsIgnoreCase("yes") || hasFinal.equalsIgnoreCase("y")) {
							System.out.print("Score received on final exam:");
							weightsAndGrades[1][2] = keyboard.nextDouble();
						} else {
							weightsAndGrades[0][2] = 0;
						}
					} else {
						weightsAndGrades[0][1] = 0;
						weightsAndGrades[0][2] = 0;
					}
				} else {
					weightsAndGrades[0][0] = 0;
					weightsAndGrades[0][1] = 0;
					weightsAndGrades[0][2] = 0;
				}
				System.out.print("Do you know your lab average?");
				String hasLabs = keyboard.next();
				if (hasLabs.equalsIgnoreCase("yes") || hasLabs.equalsIgnoreCase("y")) {
					System.out.print("Average lab grade:");
					weightsAndGrades[1][3] = keyboard.nextDouble();
				} else {
					weightsAndGrades[0][3] = 0;
				}
				System.out.print("Do you know your project average?");
				String hasProjects = keyboard.next();
				if (hasProjects.equalsIgnoreCase("yes") || hasProjects.equalsIgnoreCase("y")) {
					System.out.print("Average project grade:");
					weightsAndGrades[1][4] = keyboard.nextDouble();
				} else {
					weightsAndGrades[0][4] = 0;
				}
				System.out.print("Do you know your participation average?");
				String hasParticipation = keyboard.next();
				if (hasParticipation.equalsIgnoreCase("yes") || hasParticipation.equalsIgnoreCase("y")) {
					System.out.print("Average participation grade:");
					weightsAndGrades[1][5] = keyboard.nextDouble();
				} else {
					weightsAndGrades[0][5] = 0;
				}
				System.out.print("Do you know your quiz average?");
				String hasQuizzes = keyboard.next();
				if (hasQuizzes.equalsIgnoreCase("yes") || hasQuizzes.equalsIgnoreCase("y")) {
					System.out.print("Average quiz grade:");
					weightsAndGrades[1][6] = keyboard.nextDouble();
				} else {
					weightsAndGrades[0][6] = 0;
				}

				// calculates current number grade
				for (int i = 0; i < 7; i++) {
					score += weightsAndGrades[0][i] * weightsAndGrades[1][i];
					totalKnownGradeWeight += weightsAndGrades[0][i];
				}
				score /= totalKnownGradeWeight;

				System.out.printf("Current grade score:%.2f\n", score);

				// finds letter equivalent of current grade
				if (score >= 90) {
					currentLetterGrade = 'A';
				} else if (score >= 80) {
					currentLetterGrade = 'B';
				} else if (score >= 70) {
					currentLetterGrade = 'C';
				} else if (score >= 60) {
					currentLetterGrade = 'D';
				} else {
					currentLetterGrade = 'F';
				}
				System.out.println("Your current letter grade:" + currentLetterGrade);

				// finds minimum value of desired final grade
				switch (letterGrade) {
				case 'A':
					finalOverallScore = 90.0;
					break;
				case 'B':
					finalOverallScore = 80.0;
					break;
				case 'C':
					finalOverallScore = 70.0;
					break;
				case 'D':
					finalOverallScore = 60.0;
					break;
				default:
					finalOverallScore = 0;
					break;
				}

				if (100 - totalKnownGradeWeight > 0) {
					if (score <= finalOverallScore) {

						// calculates average necessary to get wanted final grade
						double avgToFinalLetterGrade = (100 * finalOverallScore - score * totalKnownGradeWeight)
								/ (100 - totalKnownGradeWeight);
						if (avgToFinalLetterGrade <= 100.0) {
							System.out.printf("In order to receive a grade of " + letterGrade
									+ ", \nyou have to score an average greater than \nor equal to %.2f in the rest of the grade items.",
									avgToFinalLetterGrade);
						} else {
							System.out.println("Unfortunately, a grade of " + letterGrade + " is not possible.");
						}
					} else {
						// user will get at least this grade depending on their current scores
						System.out.println("You will receive at least a grade of " + letterGrade);
					}
				} else {

					// checks if user got wanted final grade or not
					if (currentLetterGrade < letterGrade) {
						System.out.println(
								"Good Job. Your grade is: " + currentLetterGrade + ", higher than what you wanted!");
					} else if (currentLetterGrade == letterGrade) {
						System.out.println("Congratulations! You received the " + letterGrade + " that you wanted!");
					} else {
						System.out.println("Unfortunately, a grade of " + letterGrade + " is not possible.");
					}
				}

			}
		}
	}
}
