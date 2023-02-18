package com.java.codings;

public class findThirdHighestSalaryMain {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 7, 8, 9 };
		int result = findThirdHighest(arr);
		System.out.println(result);
	}

	private static int findThirdHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		int thirdHighest = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			} else if (i > thirdHighest) {
				secondHighest = i;
			} 

		}
		return secondHighest;
	}

}
