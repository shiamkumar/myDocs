package com.java.logic.coding;
//package com.test.programs;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StringCountDuplicateCharacters {
//
//	private static List chars = new ArrayList();
//	
//	public static void main(String[] args) {
//		countOfDuplicateCharacter("aaaabbbcccccdddddd");
//	}
//
//	private static void countOfDuplicateCharacter(String input) {
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//
//			if (isProcessedChar(ch))
//				continue;
//
//			int count = 0;
//			for (int j = 0; j < input.length(); j++) {
//				if (ch == input.charAt(j)) {
//					count++;
//				}
//			}
//			System.out.println(ch + " : " + count);
//		}
//		chars.clear();
//	}
//
//	private static boolean isProcessedChar(char ch) {
//		if (chars.contains(Character.toString(ch))) {
//			return true;
//		} else {
//			chars.add(Character.toString(ch));
//		}
//		return false;
//	}
//
//}
