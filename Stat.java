/*
 * [Stat].java
 * Author:  [Sidney Johnson] 
 * Submission Date:  [7/28/24]
 *
 * Purpose: To practice defining your own classes, in this case implementing a class
 * called Stat that is described using a UML class diagram.
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

public class Stat {
	// private instance variable of Stat 
	private double[] data;

	//constructor with no inputs
	public Stat() {
		double[] data = { 0.0 };
		this.data = data;
	}

	//input of double[] d data
	public Stat(double[] d) {
		int N = d.length;
		double[] data = new double[N];
		for (int i = 0; i < N; i++) {
			data[i] = d[i];
		}
		this.data = data;
	}

	// accessor 
	public double[] getData() {
		int N = this.data.length;
		double[] data = new double[N];
		for (int i = 0; i < N; i++) {
			data[i] = this.data[i];
		}
		return data;
	}

	// mutator 
	public void setData(double[] d) {
		int N = d.length;
		double[] data = new double[N];
		for (int i = 0; i < N; i++) {
			data[i] = d[i];
		}
		this.data = data;
	}

	// compares two Stat objects and returns a boolean if data is identical or not
	public boolean equals(Stat s) {
		if (this.data.length != s.getData().length)
			return false;
		for (int i = 0; i < this.data.length; i++) {
			if (this.data[i] != s.getData()[i])
				return false;
		}
		return true;
	}

	// method that converts the data into a nicely formatted string
	public String toString() {
		String data = "[";
		for (int i = 0; i < this.data.length; i++) {
			if (i == this.data.length - 1)
				data += this.data[i] + "]";
			else
				data += this.data[i] + ",";
		}
		return data;
	}

	// finds the minimum value and returns it
	public double min() {
		double min = Double.POSITIVE_INFINITY;
		for (int i = 0; i < data.length; i++) {
			if (data[i] < min)
				min = data[i];
		}
		return min;
	}

	// finds the maximum value and returns it
	public double max() {
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > max)
				max = data[i];
		}
		return max;
	}

	// computes the average and returns it
	public double average() {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	// computes the mode returns it. Returns NaN if no value exists
	public double mode() {

		// creates new array that stores number of times each data point occurs in the slot
		int[] count = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j])
					count[j]++;
			}
		}

		// goes through array and finds index that has the max count value
		int maxIndex = 0;
		int maxValue = count[0];
		for (int i = 1; i < count.length; i++) {
			if (count[i] > maxValue) {
				maxIndex = i;
				maxValue = count[i];
			}
		}

		// checks if more than one max occurrences with different values, if so returns NaN
		for (int i = 0; i < data.length; i++) {
			if (count[i] == maxValue && data[i] != data[maxIndex])
				return Double.NaN;
		}

		// if statement is not run, returns value of most frequent data point
		return data[maxIndex];
	}
}
