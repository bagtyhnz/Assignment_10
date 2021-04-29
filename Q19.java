package Assignments.strings10;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "java" appears anywhere in the
		 * given string word.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String str = scn.nextLine();
		scn.close();

		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, (i + 4)).equals("java")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
