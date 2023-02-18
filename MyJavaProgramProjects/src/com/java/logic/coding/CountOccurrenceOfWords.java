package com.java.logic.coding;

import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		String text = "Good morning class. Have a good learning class. Enjoy learning with fun!";
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (map.get(key) == null) {
					map.put(key, 1);
				} else {
					int value = map.get(key).intValue();
					value++;
					map.put(key, value);
				}
			}
		}
		System.out.println(map);
	}
}
