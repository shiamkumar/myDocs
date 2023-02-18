package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsAndCount {
	public static void main(String[] args) {
		List<String> list02 = Arrays.asList("jack", "kelly", "john", "jack", "john", "john");
		Map<String, Long> map02 = list02.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map02);
	}
}
