package com.java.eight.codings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

		List<Integer> result01 = list1.stream().filter(item -> list2.contains(item)).collect(Collectors.toList());
		System.out.println(result01);

		List<Integer> result02 = list1.stream().distinct().filter(list2::contains).collect(Collectors.toList());
		System.out.println(result02);
	}
}
