/*
 * [Circle].java
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
// Circle.java
//
// 
//*******************************************************
public class Circle {

	private String name; // declare the private String instance name
	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// Used to compare doubles. Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	// ----------------------------------------------
	// getName - returns the value of name
	// ----------------------------------------------
	public String getName() {

		return name;
	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {

		return x;
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {

		return y;
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {

		return radius;
	}

	// ----------------------------------------------
	// setName - assigns a new value to name
	// ----------------------------------------------
	public void setName(String newName) {

		this.name = newName;
	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double newX) {

		this.x = newX;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double newY) {

		this.y = newY;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double newRadiu) {

		if (newRadius >= 0) {
			this.radius = newRadius;
		}
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return Math.PI * Math.pow(radius, 2);
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {

		return 2 * Math.PI * radius;
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		return radius * 2;
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if (((radius - 1.0) < THRESHOLD) && ((x - 0.0) < THRESHOLD) && ((y - 0.0) < THRESHOLD)) {
			return true;
		} else {
			return false;
		}

	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// name: name
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return "\nname: " + name + "\ncenter: " + "(" + x + "," + y + ")" + "\nradius: " + radius;

	}

	public boolean equals(Circle anotherCircle) {
		if ((anotherCircle.radius - radius) < THRESHOLD && (anotherCircle.x - x) < THRESHOLD
				&& (anotherCircle.y - y) < THRESHOLD) {
			return true;
		} else {
			return false;
		}
	}

	public double distance(Circle anotherCircle) {
		return Math.sqrt(Math.pow(x - anotherCircle.x, 2) + Math.pow(y - anotherCircle.y, 2));
	}

	public boolean isSmaller(Circle anotherCircle) {
		if (this.diameter() < anotherCircle.diameter()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo(Circle anotherCircle) {
		if (this.diameter() > anotherCircle.diameter()) {
			return 1;
		}
		if (this.diameter() < anotherCircle.diameter()) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean intersects(Circle anotherCircle) {
		if (this.distance(anotherCircle) < (this.radius + anotherCircle.radius)) {
			return true;
		} else {
			return false;
		}
	}

}
