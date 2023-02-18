package com.java.eight;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmpoyeeSortingUsingMap {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("e3", "Jack");
		map.put("e2", "Kelly");
		map.put("e1", "David");
		map.put("e4", "Harris");

		Map<String, String> ascendingSortedMap01 = new TreeMap<String, String>(map);
		System.out.println(ascendingSortedMap01);

		Map<String, String> descendingSortedMap01 = new TreeMap<String, String>(Collections.reverseOrder());
		descendingSortedMap01.putAll(map);
		System.out.println(descendingSortedMap01);

		Map<String, String> ascendingSortedMap02 = map.entrySet().stream()
				.sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(ascendingSortedMap02);
		
		Map<String, String> descendingSortedMap02 = map.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByKey())) 
				//.sorted(Entry.comparingByKey(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(descendingSortedMap02);

	}
}
