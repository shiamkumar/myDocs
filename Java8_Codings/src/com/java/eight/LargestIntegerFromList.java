package com.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestIntegerFromList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-1, -4, -5, -2, -3, 3, 4, 5, 2, 1);
		
		List<Integer> poslist = list.stream().filter(item -> item < 0).collect(Collectors.toList());
		//System.out.println(poslist);
		
		List<Integer> neglist = list.stream().filter(item -> item > 0).collect(Collectors.toList());
		//System.out.println(neglist);

		List<Integer> orderedposlist = poslist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(orderedposlist);
		
		List<Integer> orderedneglist = neglist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(orderedneglist);
	}
}
