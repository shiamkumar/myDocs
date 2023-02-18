package com.java.logic.coding;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {

		String str = "abaabbcbcccc";
		String uniqueStr = removeDuplicates(str);
		char[] chars = convertToCharArray(uniqueStr);
		for (char ch : chars) {
			int count = countRepeatdCharacters(ch, str);
			System.out.println(ch + " : " + count);
		}
	}

	private static int countRepeatdCharacters(char ch, String str) {
		String removedRepeat = str.replace(String.valueOf(ch), "");
		int count = str.length() - removedRepeat.length();
		return count;
	}

	private static char[] convertToCharArray(String str) {
		char[] charArray = str.toCharArray();
		return charArray;
	}

	public static String removeDuplicates(String str) {
		Set<Character> setCharacter = new HashSet<Character>();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (setCharacter.add(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}

}
