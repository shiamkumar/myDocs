package com.java.codings;

public class PalindromMain {
	public static void main(String[] args) {
		String actual = "kayak";
		String reverse = isPalindrome(actual);
		System.out.println(reverse);
	}

	private static String isPalindrome(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}
