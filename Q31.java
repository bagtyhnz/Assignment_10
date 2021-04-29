package Assignments.strings10;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		/*
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward, e.g., madam or nurses run.
		 * 
		 * So method isPalindrome checks that and returns true if check is palindrome
		 * and false if it is not.
		 * 
		 * make your conditions case insensitive. ex: Civic and civic are both
		 * palindromes - make your conditions space insensitive. Race car is a
		 * palindrome even though there is space in between.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur text: ");
		String text = scn.nextLine();
		System.out.println(isPalindrome(text));
		scn.close();
	}

	private static boolean isPalindrome(String text) {
		text = text.replaceAll(" ", "").toLowerCase();
		String reversed = "";

		for (int i = text.length() - 1; i >= 0; i--) {
			reversed = reversed + text.charAt(i);
		}
		return (text.equals(reversed));
	}
}
