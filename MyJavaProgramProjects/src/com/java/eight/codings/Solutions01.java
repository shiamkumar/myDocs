package com.java.eight.codings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solutions01 {
	public static void main(String[] args) {
		int[] input = { 0, 3, 5, 4, 2, 3, 3, 0 };
		List<Integer> numbers = Arrays.stream(input).boxed().collect(Collectors.toList());
		Integer firstIndex = 0;
		Integer lastIndex = input.length;
		Integer currentIndex = findIndex(input, 4);
		List<Integer> leftSublist = subStream(numbers.stream(), firstIndex, currentIndex - 1)
				.collect(Collectors.toList());
		int leftSum = leftSublist.stream().mapToInt(item -> item).reduce(0, (x, y) -> x + y);

		List<Integer> rightSublist = subStream(numbers.stream(), currentIndex + 1, lastIndex - 1)
				.collect(Collectors.toList());
		int rightSum = rightSublist.stream().mapToInt(item -> item).reduce(0, (x, y) -> x + y);

		boolean result = (leftSum == rightSum) ? true : false;
		if (result == true) {
			System.out.println(findIndex(input, 4));
		} else {
			System.out.println("0");
		}
	}

	public static Integer findIndex(int[] input, Integer currIndex) {
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 4) {
				index = i;
			}
		}
		return index;
	}

	private static Stream<Integer> subStream(Stream<Integer> stream, int startIndex, int endIndex) {
		Stream<Integer> result = stream
				.collect(Collectors.toList())
				.subList(startIndex, endIndex + 1).stream();
		return result;
	}

}
