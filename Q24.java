package Assignments.strings10;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		/*
		 * Given a string, print out true if the number of appearances of "java"
		 * anywhere in the string is equal to the number of appearances of "python"
		 * anywhere in the string (case sensitive).
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur String value: ");
		String str = scn.nextLine();
		scn.close();

		int javaCount = 0, pythonCount = 0;

		for (int i = 0; i < str.length() - 5; i++) {

			if (str.substring(i, i + 4).equals("java")) {
				javaCount++;
			}
			if (str.substring(i, i + 6).equals("python")) {
				pythonCount++;
			}
		}
		System.out.println(javaCount == pythonCount);
	}
}
