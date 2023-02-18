package com.java.eight;

import java.util.Arrays;
import java.util.List;

public class PairsOfSumForGivenArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(8, 7, 2, 5, 3, 1);
		int k = 10;
		findPair(list, k);
	}

	private static void findPair(List<Integer> list, int target) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					System.out.println("Pair found: " + list.get(i) + "," + list.get(j));
				}
			}
		}
	}
}
