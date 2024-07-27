/*
 * [DrawingShapes].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [7/25/24]
 *
 * Purpose: To demonstrate knowledge of loops, decision statements, and nested statements to draw shapes.
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

public class DrawingShapes {

    public static void main(String[] args) {
    	
        Scanner keyboard = new Scanner(System.in);
        
        //asks to enter a shape (rectangles, triangles, hexagons, octagons, and pentagons (r,t,h,o,p))
        System.out.println("Enter a shape: r t h o p");
        String shape = keyboard.next();
        
        //input validation
        if (!(shape.equals("r")) && !(shape.equals("t")) && !(shape.equals("h")) && !(shape.equals("o")) && !(shape.equals("p"))) {
            System.out.println("Invalid shape" + "\n" + "Goodbye!");
            System.exit(0);
        }
        
        System.out.println("Enter a length");
        int length = keyboard.nextInt();
        
        if (length <= 1) {
            System.out.println("Length must be greater than 1" + "\n" + "Goodbye!");
            System.exit(0);
        }
        
        //draws the rectangle
        if (shape.equals("r")) {
            System.out.println("Enter a height");
            int height = keyboard.nextInt();
            if (height <= 1) {
                System.out.println("Height must be greater than 1" + "\n" + "Goodbye!");
                System.exit(0);
            }
            System.out.println("Below is a " + length + " by " + height + " rectangle of *");
            for (int i = 0; i < height; i++) {
                System.out.print("*".trim());
                for (int a = 0; a < (length - 1); a++) {
                    System.out.print("*".trim());
                }
                System.out.println();
            }
        }
        
        //draws the triangle
        if (shape.equals("t")) {
            System.out.println("Below is a triangle with two side lengths of " + length + " *");
            for (int i = 0; i < length; i++) {
                for (int x = length - i; x > 1; x--) {
                    System.out.print(" ");
                }
                for (int a = 0; a <= i; a++) {
                    System.out.print("*".trim());
                }
                for (int a = 0; a < i; a++) {
                    System.out.print("*".trim());
                }
                System.out.println();
            }
        }
        
        //draws the hexagon
        if (shape.equals("h")) {
            System.out.println("Below is a hexagon with side lengths of " + length + " *");
            int k, l, i, a;
            // the loop statement for the top portion of the hexagon
            for (i = 1, k = length, l = 2 * length - 1; i < length; i++, k--, l++) {
                for (int x = i; x <= length - 1; x++) {
                    System.out.print(" ");
                }
                for (a = 0; a < 3 * length; a++) {
                    if (a >= k - 1 && a <= l - 1) {
                        System.out.print("*".trim());
                    } else {
                        System.out.print(" ".trim());
                    }
                }
                System.out.println();
            }
            //loop for lower portion of the hexagon
            for (i = 0, k = 1, l = 3 * length - 2; i < length; i++, k++, l--) {
                for (a = 0; a < 3 * length; a++) {
                    if (a >= k - 1 && a <= l - 1) {
                        System.out.print("*".trim());
                    } else if (!(a >= k)) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
        //draws the octagon
        if (shape.equals("o")) {
            System.out.println("Below is an octagon with side lengths of " + length + " *");
            int k, l, i, a;
            
            //loop for top portion of the octagon
            for (i = 0, k = length, l = 2 * length - 1; i < length; i++, k--, l++) {
                for (int x = i; x <= length - 2; x++) {
                    System.out.print(" ");
                }
                for (a = 0; a < 3 * length; a++) {
                    if (a >= k - 1 && a <= l - 1) {
                        System.out.print("*".trim());
                    }
                }
                System.out.println();
            }
            //loop for middle portion of the octagon
            for (i = 0; i < length - 2; i++) {
            	
             
                System.out.print("*".trim());
                for (a = 0; a <= l - 3; a++) {
                    System.out.print("*".trim());
                }
                System.out.println();
            }
            //loop for lower portion of the octagon
            for (i = 0, k = 1, l = 3 * length - 2; i < length; i++, k++, l--) {
                for (a = 0; a < 3 * length; a++) {
                    if (a >= k - 1 && a <= l - 1) {
                        System.out.print("*".trim());
                    } else if (!(a >= k)) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
        //draws the pentagon
        if (shape.equals("p")) {
            System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
            int i, a, j, l = 2 * length - 1;
            
            //loop for top portion of the pentagon
            for (i = 0; i < length; i++) {
                for (j = length - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (a = 0; a <= i; a++) {
                    System.out.print("*".trim());
                }
                for (a = 0; a < i; a++) {
                    System.out.print("*".trim());
                }
                System.out.println();
            }
            //loop for lower portion of the pentagon
            for (i = 0; i < length - 1; i++) {
                System.out.print("*".trim());
                for (a = 0; a <= l - 2; a++) {
                    System.out.print("*".trim());
                }
                System.out.println();
            }
        }
        
        keyboard.close();
    }
}
