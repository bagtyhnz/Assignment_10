package Assignments.strings10;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {

		/*
		 * Write a program that will print out letters in the alphabetic order
		 * accordingly to the given range within 2 chars.
		 */
		
		String alphabet="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 1st letter: ");
		String ch1 = scn.next();
		
		System.out.println("enter 2nd letter: ");
		String ch2 = scn.next();
		scn.close();
		
		String newString=alphabet.substring(alphabet.indexOf(ch1), alphabet.indexOf(ch2)+1);
		System.out.println(newString);
	}
}
