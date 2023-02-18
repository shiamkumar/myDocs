package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbersAndCount {
	public static void main(String[] args) {
		List<Integer> list01 = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 6, 6);
		Map<Integer, Long> map01 = list01.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map01);
	}
}
