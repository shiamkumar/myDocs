package com.java.eight.codings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*  Find duplicate numbers/words from the list  */
public class FindDuplicateNumbersMain {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(11, 22, 33, 44, 55, 44, 33);
		Set<Integer> hs01 = new HashSet<Integer>();
		List<Integer> dupList = numbersList.stream()
				.filter(item -> !hs01.add(item))
				.collect(Collectors.toList());
		System.out.println(dupList);
		
		Set<String> hs02 = new HashSet<String>();
		List<String> strList = Arrays.asList("John", "kelly", "Peter", "Scott", "Peter", "Scott");
		List<String> dupList02 = strList.stream()
				.filter(x -> !hs02.add(x))
				.collect(Collectors.toList());
		System.out.println(dupList02);
	}
}
