package com.java.codings;

public class FibonacciMainClass {
	public static void main(String[] args) {
		int size = 10;
		for (int i = 0; i < size; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int count) {
		return (count <= 1) ? count : fibonacci(count - 2) + fibonacci(count - 1);
	} 
	
}
