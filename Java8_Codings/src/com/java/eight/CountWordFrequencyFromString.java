package com.java.eight;

import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CountWordFrequencyFromString {
	public static void main(String[] args) {
		String text = "Bob had had had had had a better effect on on the teacher";
		ConcurrentMap<String, Integer> freqMap = Arrays
				.asList(text.split("[\\s.]"))
				.parallelStream()
				.filter(s -> !s.isEmpty())
				.collect(Collectors.toConcurrentMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
		System.out.println(freqMap.toString());
	}
}
