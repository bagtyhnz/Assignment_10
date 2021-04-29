package Assignments.strings10;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		/*
		 * Given a string, consider the prefix string made of the first n chars of the
		 * string. Does that prefix string appear somewhere else in the string? Assume
		 * that the string is not empty and that n is in the range from 1 till
		 * str.length().
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String str = scn.nextLine();
		System.out.println("enter the prefix length: ");
		int prefixLength = scn.nextInt();
		scn.close();

		if (str.isEmpty() == false && prefixLength > 0 && prefixLength < str.length()) {

			String prefix = str.substring(0, prefixLength);
			boolean b = str.substring(prefixLength, str.length() - 1).contains(prefix);
			System.out.println("prefix \"" + prefix + "\" occurs somewhere else in the word: " + b);
		}
	}
}
