package Assignments.strings10;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {

		/*
		 * This method gets a string and an int, it returns a string. What it does is to
		 * limit the input string to a creating number of characters.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur text: ");
		String text = scn.nextLine();
		System.out.println("how many chracters to print out?: ");
		int length = scn.nextInt();
		scn.close();
		limitedText(text, length);
	}

	private static void limitedText(String text, int length) {

		System.out.println(text.substring(0, length));
	}
}
