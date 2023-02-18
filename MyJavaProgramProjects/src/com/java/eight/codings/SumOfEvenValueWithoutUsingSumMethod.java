package com.java.eight.codings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*  Sum of even numbers for given list  w/o using any java8 sum() - using reduce() */
public class SumOfEvenValueWithoutUsingSumMethod {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
		List<Integer> evenNumbersList = list.stream()
				.filter(item -> item%2==0)
				.collect(Collectors.toList());
		
		int result = evenNumbersList.stream()
				.mapToInt(item -> item)
				.reduce(0, (x,y) -> x+y);
		System.out.println(result);
	}
}
