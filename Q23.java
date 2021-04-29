package Assignments.strings10;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		/*
		 * A sandwich is two pieces of bread with something in between. Print the string
		 * that is between the first and last appearance of "bread" in the given string,
		 * or return string "nothing" if there are not two pieces of bread.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("sandwich ingredients: ");
		String sandwich = scn.nextLine();
		scn.close();

		if (sandwich.contains("bread") == true
				&& (sandwich.substring(sandwich.indexOf("bread") + 4)).contains("bread") == true) {

			int startIndex = sandwich.indexOf("bread") + 4;
			String ingredientsStart = sandwich.substring(startIndex + 1);
			int endIndex = ingredientsStart.indexOf("bread");
			String ingredients = ingredientsStart.substring(0, endIndex);
			System.out.println(ingredients);

		} else {
			System.out.println("invalid sandwich!");
		}
	}
}
