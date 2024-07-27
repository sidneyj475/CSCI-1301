/*
 * [CircleTester].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  {7/23/24]
 *
 * Purpose: To create classes utilizing, access modifiers, instance variables, methods which return values, void methods, 
 * methods calling other methods, accessor methods, mutator methods, and the equals() method.
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

//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println(circle1);

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println(circle2);
		// print circle1 diameter, area and perimeter
		System.out.println("Circle 1's diameter = " + circle1.diameter());
		System.out.println("Circle 1's area = " + circle1.area());
		System.out.println("Circle 1's perimeter = " + circle1.perimeter());
		// print circle2 diameter, area and perimeter
		System.out.println("Circle 2's diameter = " + circle2.diameter());
		System.out.println("Circle 2's area = " + circle2.area());
		System.out.println("Circle 2's perimeter = " + circle2.perimeter());
		// display whether circle1 is a unit circle
		System.out.println("Circle 1 is a unit circle =" + circle1.isUnitCircle());
		// display whether circle2 is a unit circle
		System.out.println("Circle 2 is a unit circle =" + circle2.isUnitCircle());
		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		// isSmaller tests
		if (circle1.isSmaller(circle2) == false) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("Failed: Is Smaller");
		}
		if (circle4.isSmaller(circle2) == true) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("Failed: Is Smaller");
		}
		if (circle4.isSmaller(circle3) == true) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("Failed: Is Smaller");
		}
		if (circle3.isSmaller(circle4) == false) {
			System.out.println("PASSED: Is Smaller");
		} else {
			System.out.println("Failed: Is Smaller");
		}
		System.out.println("Circle 1 is smaller than Circle 2 = " + circle1.isSmaller(circle2));
		System.out.println("Circle 4 is smaller than Circle 2 = " + circle4.isSmaller(circle2));
		System.out.println("Circle 4 is smaller than Circle 3 = " + circle4.isSmaller(circle3));
		System.out.println("Circle 3 is smaller than Circle 4 = " + circle3.isSmaller(circle4));
		// compare to tests
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("Failed: Compare To");
		}
		if (circle4.compareTo(circle2) == -1) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("Failed: Compare To");
		}
		if (circle4.compareTo(circle3) == -1) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("Failed: Compare To");
		}
		if (circle3.compareTo(circle4) == 1) {
			System.out.println("PASSED: Compare To");
		} else {
			System.out.println("Failed: Compare To");
		}
		System.out.println("Circle 1 compared to Circle 2 = " + circle1.compareTo(circle2));
		System.out.println("Circle 4 compared to Circle 2 = " + circle4.compareTo(circle2));
		System.out.println("Circle 4 compared to Circle 3 = " + circle4.compareTo(circle3));
		System.out.println("Circle 3 compared to Circle 4 = " + circle3.compareTo(circle4));
		// Intersects tests
		circle4.setRadius(8);
		if (circle1.intersects(circle2) == true) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("Failed: Intersects");
		}
		if (circle4.intersects(circle2) == true) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("Failed: Intersects");
		}
		if (circle4.intersects(circle3) == true) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("Failed: Intersects");
		}
		if (circle3.intersects(circle1) == false) {
			System.out.println("PASSED: Intersects");
		} else {
			System.out.println("Failed: Intersects");
		}

	}

}
