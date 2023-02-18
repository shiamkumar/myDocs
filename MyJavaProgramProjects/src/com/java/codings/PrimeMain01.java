package com.java.codings;

import java.util.ArrayList;
import java.util.List;

public class PrimeMain01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			List<Integer> res = prime(i);
			System.out.print(res + " ");
		}
	}

	public static List<Integer> prime(int number) {
		List<Integer> prime = new ArrayList<Integer>();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			prime.add(number);
			//System.out.println(number + " is prime number ");
		} else {
			//System.out.println(number + " is not a prime number ");
		}
		return prime;
	}

}
