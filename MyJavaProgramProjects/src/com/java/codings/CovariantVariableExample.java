package com.java.codings;

class A {
	public Object m1() {
		System.out.println("Class-A: m1()");
		return null;
	}
}

class B extends A {
	@Override
	public String m1() {
		System.out.println("Class-B: m1()");
		return null;
	}
}

public class CovariantVariableExample {
	public static void main(String[] args) {
		
		B b = new B();
		b.m1();
		
		A a = new B();
		a.m1();
	}
}
