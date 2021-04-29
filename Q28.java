package Assignments.strings10;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		/*
		 * This method gets two strings (text and badWord) and returns a string.
		 * Basically what it does is take out all the occurrences of badWord in text.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur text: ");
		String text = scn.nextLine();
		System.out.println("enter bad word: ");
		String badWord = scn.nextLine();

		cleanText(text, badWord);
		scn.close();
	}

	private static void cleanText(String text, String badWord) {

		System.out.println(text.replaceAll(badWord, ""));
	}
}
