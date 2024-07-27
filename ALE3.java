package aletres;

import java.lang.Math;
import java.util.Scanner;

public class ALE3 {
	public static void calculation(int n) {
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.println(i + " ");
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		calculation(num);
		keyboard.close();

	}
}