package com.java.logic.coding;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharactersCount {

	public static void main(String[] args) {
		String str = "aacbbccddddx";
		String uniqueStr = removeDuplicates(str);
		char[] characters = convertsCharArray(uniqueStr);
		for (char character : characters) {
			int count = countOfRepeatedCharacters(str, character);
			System.out.println(character + " : " + count);
		}
	}

	public static String removeDuplicates(String str) {
		Set<Character> setCharacters = new HashSet<Character>();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (setCharacters.add(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}

	public static char[] convertsCharArray(String str) {
		char[] chars = str.toCharArray();
		return chars;
	}

	public static int countOfRepeatedCharacters(String str, char character) {
		String removedRepeated = str.replace(String.valueOf(character), "");
		int count = str.length() - removedRepeated.length();
		return count;
	}

}
