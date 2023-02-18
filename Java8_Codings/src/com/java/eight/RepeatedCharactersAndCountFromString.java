package com.java.eight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedCharactersAndCountFromString {
	public static void main(String[] args) {
		String text = "stress";
		Set<Character> set = new HashSet<Character>();
		List<Character> unniqueChars = text.chars().mapToObj(item -> (char) item).filter(item -> set.add(item))
				.collect(Collectors.toList());
		for (char unniqueChar : unniqueChars) {
			long count = text.chars().filter(item -> item == unniqueChar).count();
			System.out.println(unniqueChar + " : " + count);
		}
	}
}
