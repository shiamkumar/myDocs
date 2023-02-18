package com.java.logic.coding;

public class PalindromeMainClass {
	public static void main(String[] args) {
		String str = "aibohphobia";
		String response = Palindrome(str);
		System.out.println(response);
	}

	public static String Palindrome(String str) {
		String result = null;
		int length = str.length();
		for (int i = 0; i < length/2; i++) {
			if (str.charAt(i) == str.charAt(length-i-1)) {
				result = "string is palindrome";
			} else {
				result = "string is not palindrome";
			}
		}
		return result;
	}

}
