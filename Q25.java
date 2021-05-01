package Assignments.strings10;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		/*
		 * When gears merge and work together, one tooth from each one goes in order.
		 * Write a method mergeStrings that will return the strings merged, one letter
		 * at a time, starting with one. Please note one and two can be of different
		 * lengths.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the 1st word: ");
		String str1 = scn.nextLine();
		System.out.println("enter the 2nd word: ");
		String str2 = scn.nextLine();
		System.out.println(mergeStrings(str1, str2));
		scn.close();
	}

	public static String mergeStrings(String str1, String str2) {

		String mergeString = "";
		if (str1.length() <= str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				mergeString = mergeString + str1.substring(i, i + 1) + str2.substring(i, i + 1);
			}
			mergeString = mergeString + str2.substring(str1.length());
		} else {
			for (int i = 0; i < str2.length(); i++) {
				mergeString = mergeString + str1.substring(i, i + 1) + str2.substring(i, i + 1);
			}
			mergeString = mergeString + str1.substring(str2.length());
		}
		return mergeString;
	}
}
