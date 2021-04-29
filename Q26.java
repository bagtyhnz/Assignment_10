package Assignments.strings10;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		/*
		 * uniqueChars is a method that you will code now, should be able to accept any
		 * string in the word and return unique characters from the parameter.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String str = scn.nextLine();
		scn.close();
		uniqueChars(str);
	}

	public static void uniqueChars(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (str.substring(0, i).contains(str.substring(i, i + 1)) == false) {
				System.out.print(str.substring(i, i + 1));
			}
		}
	}
}
