package com.java.eight.lambda;

class ThreadDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("Run method using traditional...");
	}
}

public class RunnableLambdaMainClass {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();

		Runnable runnable = () -> System.out.println("run() using lambda...");
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
	}
}
