package Assignments.strings10;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		/*
		 * at3 method gets two strings and returns a string. The first string is the one
		 * that will be manipulated. At the 3rd char position of the target you will
		 * insert the word argument.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur text: ");
		String text = scn.nextLine();
		System.out.println("enter text to add: ");
		String addText = scn.nextLine();

		at3(text, addText);
		scn.close();
	}

	private static void at3(String text, String addText) {

		String newText = text.substring(0, 3) + addText + text.substring((3));
		System.out.println(newText);
	}
}
