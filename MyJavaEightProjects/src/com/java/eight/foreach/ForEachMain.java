package com.java.eight.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(item -> { System.out.print(item + "	");
		});
	}
}
