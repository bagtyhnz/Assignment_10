package Assignments.strings10;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {

		/*
		 * In mathematics, the factorial of a positive integer n, denoted by n!, is the
		 * product of all positive integers less than or equal to n. Calculate factorial
		 * and output result to the console.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num = scn.nextInt();
		scn.close();
		
		int facNum = 1;
		
		for (int i = 1; i <= num; i++) {
			facNum = facNum * i;
		}
		System.out.println(facNum);
	}
}
