package Assignments.strings10;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in
		 * the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
		 * string should be 4 and more characters.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String str = scn.nextLine();
		scn.close();
		
		if (str.length() > 3) {
			if (str.indexOf("java") == 0 || str.indexOf("java") == 1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}
