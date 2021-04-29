package Assignments.strings10;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {

		/*
		 * Given two strings, word and a separator sep, return a big string made of
		 * count occurrences of the word, separated by the separator string.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String word = scn.next();

		System.out.println("enter the separator: ");
		String separator = scn.next();

		System.out.println("amount of occurences of the word: ");
		int count = scn.nextInt();
		scn.close();

		for (int i = 0; i < count; i++) {
			System.out.print(word);
			if (i < count - 1) {
				System.out.print(separator);
			}
		}
	}
}
