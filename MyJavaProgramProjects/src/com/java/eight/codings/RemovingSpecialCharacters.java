package com.java.eight.codings;

public class RemovingSpecialCharacters {
	public static void main(String[] args) {
		String str01 = "This#string%contains^special*characters&.";
		str01 = str01.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str01);

		String str02 = "This#string%contains^special*characters&.";
		str02 = str02.replaceAll("[#%^*&.]*", "");
		System.out.println(str02);

		String str03 = "h*ello#567"; //"Th*is#st&ring^";
		String str04 = "";
		char myCh = str03.charAt(0);
		for (int i = 1; i < str03.length(); i++) {
			 if (!Character.isDigit(str03.charAt(i))) {
				 //str04 += str04 + myCh;
				 System.out.println(str03.charAt(i));
			 }
		}
		
	}
}
