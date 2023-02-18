package com.java.codings;

public class PyramidsMain01 {
	public static void main(String[] args) {
		printPattern2(5);
	}
	
	private static void printPattern2(int rows) {
		// for loop for the rows
		for (int i = 1; i <= rows; i++) {
			// white spaces in the front of the numbers
			int numberOfWhiteSpaces = rows - i;

			//print leading white spaces
			printString(" ", numberOfWhiteSpaces);

			//print numbers
			for(int x = 1; x<=i; x++) {
				System.out.print(x+" ");
			}

			//move to next line
			System.out.println("");
		}
	}
	
	//utility function to print string given times
		private static void printString(String str, int times) {
			for (int j = 0; j < times; j++) {
				System.out.print(str);
			}
		}

}
