package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckLeftsidesumAndRightsidesumOfArray {
	public static void main(String[] args) {
		int[] input = { 0, 3, 5, 4, 2, 3, 3, 0 };
		List<Integer> numbers = Arrays.stream(input).boxed().collect(Collectors.toList());
		Integer firstIndex = 0;
		Integer lastIndex = input.length;
		Integer target = 4;
		Integer currentIndex = findListIndex(numbers, target);
		List<Integer> leftSublist = subStream(numbers.stream(), firstIndex, currentIndex - 1)
				.collect(Collectors.toList());
		int leftSum = leftSublist.stream().mapToInt(item -> item).reduce(0, (x, y) -> x + y);

		List<Integer> rightSublist = subStream(numbers.stream(), currentIndex + 1, lastIndex - 1)
				.collect(Collectors.toList());
		int rightSum = rightSublist.stream().mapToInt(item -> item).reduce(0, (x, y) -> x + y);

		Integer result = (leftSum == rightSum) ? currentIndex : 0;
		System.out.println(result);
	}

	public static Integer findListIndex(List<Integer> numbers, Integer target) {
		int index = numbers.indexOf(4);
		return index;
	}

	private static Stream<Integer> subStream(Stream<Integer> stream, int startIndex, int endIndex) {
		Stream<Integer> result = stream.collect(Collectors.toList()).subList(startIndex, endIndex + 1).stream();
		return result;
	}

}
