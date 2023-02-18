package com.java.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumEvenNumbersUsingReduce {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);
		List<Integer> evenNumbersList = list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
		int result = evenNumbersList.stream().mapToInt(item -> item).reduce(0, (x, y) -> x + y);
		System.out.println(result);
		
		int sum = IntStream.of(11, 22, 33, 44, 55).filter(n -> n % 2 == 0).sum(); 
		System.out.println(sum);
		
		int sum02 = IntStream.of(11, 22, 33, 44, 55).filter(n -> n % 2 == 0).reduce(0, (x, y) -> x + y);
		System.out.println(sum02);
		
	}
}
