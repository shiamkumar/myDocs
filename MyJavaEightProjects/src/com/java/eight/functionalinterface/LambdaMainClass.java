package com.java.eight.functionalinterface;

interface Shape {
	void draw();
}

public class LambdaMainClass {
	public static void main(String[] args) {
		Shape square = () -> System.out.println("Square Clazz:draw()");
		square.draw();
		
		Shape circle = () -> System.out.println("Circle Clazz:draw()");
		circle.draw();
	}
}
