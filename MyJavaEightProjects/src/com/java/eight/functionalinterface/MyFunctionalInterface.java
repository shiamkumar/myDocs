package com.java.eight.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String message);

	default void method01() {
		System.out.println("default method");
	}

	static void method02() {
		System.out.println("static method");
	}
}
