package com.java.eight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverseUsingLogic {
	public static void main(String[] args) {
		String text = "words";
		int length = text.length();
		Stream<Character> streamChars = IntStream.range(0, text.length()).map(item01 -> length - 1 - item01)
				.mapToObj(item02 -> text.charAt(item02));
		List<Character> listChars = streamChars.collect(Collectors.toList());

		String reverse = listChars.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(reverse);
	}
}
