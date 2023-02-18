package com.java.logic.coding;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCountDuplicateCharactersUsingStreamsAPI {
	
	public static void main(String[] args) {
		countOfDuplicateCharacter("aaaabbbcccccdddddde");
	}
	
	private static void countOfDuplicateCharacter(String input) {
        IntStream intStream = input.chars();
        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);
        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(output);

    }
	
}
