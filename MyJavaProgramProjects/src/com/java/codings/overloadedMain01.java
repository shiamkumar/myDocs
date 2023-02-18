package com.java.codings;

public class overloadedMain01 {
	public static void main(String[] args) {
		foo(null);
	}

	public static void foo(Object o) {
		System.out.println("Object argument");
	}

	public static void foo(String s) {
		System.out.println("String argument");
	}
}
