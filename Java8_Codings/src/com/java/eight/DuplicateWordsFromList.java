package com.java.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWordsFromList {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("John", "kelly", "Peter", "Scott", "Peter", "Scott");
		Set<String> hs = new HashSet<String>();
		List<String> dupList = strList.stream().filter(x -> !hs.add(x)).collect(Collectors.toList());
		System.out.println(dupList);
	}
}
