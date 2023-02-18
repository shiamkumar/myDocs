package com.java.eight.lambda;

interface Addition {
	int add(int a, int b);
}

class AdditionImpl implements Addition {

	@Override
	public int add(int a, int b) {
		return (a + b);
	}

}

public class LambdaParametersMainClass {
	public static void main(String[] args) {
		Addition obj = (int a, int b) -> (a + b);
		int result = obj.add(10, 20);
		System.out.println(result);
	}
}
