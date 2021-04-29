package Assignments.strings10;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		/*
		 * Write a program, that will read HTML variable and output attribute value of
		 * id attribute (tag) into the console. Input will be provided in a single line
		 * as outlined below. If HTML variable doesn't contain <html> attribute, print
		 * out into the console message: "Invalid input!".
		 * 
		 * input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
		 * output: myid
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur html variable: ");
		String html = scn.nextLine();
		scn.close();
		
		if (html.contains("<html>") == true) {

			int startIndex = html.indexOf('"');
			String idStartPoint = html.substring(startIndex + 1);
			int endIndex = idStartPoint.indexOf('"');
			String id = idStartPoint.substring(0, endIndex);
			System.out.println(id);

		} else {
			System.out.println("invalid input!");
		}
	}
}
