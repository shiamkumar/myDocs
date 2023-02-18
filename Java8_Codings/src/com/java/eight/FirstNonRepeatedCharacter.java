package com.java.eight;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String text = "Cactuss";
		Character result = text.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream() // entryset stream
				.filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();
		System.out.println(result);
	}
}
