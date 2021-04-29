package Assignments.strings10;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		/*
		 * coverString method will take 2 string parameters from the caller.
		 * 
		 * Your job is to write an important code that will :
		 * 
		 * - to search and find each appearance of coverME within main - then surround
		 * it with [coverMe] (square brackets) - if you cannot find the coverME within
		 * main after tirelessly looping then just return whole main itself covered
		 * [main]. - keep in mind that coverME value can be of any length.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur word: ");
		String main = scn.nextLine();
		System.out.println("enter the part to cover: ");
		String cover = scn.nextLine();

		coverString(main, cover);
		scn.close();
	}

	public static void coverString(String main, String cover) {

		System.out.println(main.replaceAll(cover, "[" + cover + "]"));
	}
}
