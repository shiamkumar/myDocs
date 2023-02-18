package com.java.eight;

public class RemovingSpecialCharactersUsingReplaceAll {
	public static void main(String[] args) {
		String str01 = "It%cont#ains^special*chars&.";
		str01 = str01.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str01);

		String str02 = "It%cont#ains^special*chars&.";
		str02 = str02.replaceAll("[#%^*&.]*", "");
		System.out.println(str02);

		String str03 = "It%cont#ains^special*chars&.";
		str03 = str03.replaceAll("\\W", " ");
		System.out.println(str03);

		String str05 = "It%cont#ains^special*chars&.";
		String str06 = "";
		for (int i = 0; i < str05.length(); i++) {
			 if ((str05.charAt(i) > 64 && str05.charAt(i) <= 90) ||
			 (str05.charAt(i) > 96 && str05.charAt(i) <= 122)) {
				str06 = str06 + str05.charAt(i);
			}
		}
		System.out.println(str06);
	}
}
