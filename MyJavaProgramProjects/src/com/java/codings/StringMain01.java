package com.java.codings;

public class StringMain01 {
	public static void main(String[] args) {

		System.out.println("string pool");
		String s01 = "hello";
		String s02 = s01;
		System.out.println(s01 == s02);

		s01 = "Python";
		System.out.println(s01 == s02);

		System.out.println("+ operator has a higher precedence than the == operator. is evaluated to “s1== s2 is:abc” == “abc”");
		String s03 = "abc";
		String s04 = "abc";
		System.out.println("s03 == s04 is:" + s03 == s04);

		System.out.println("substring");
		String s05 = "hello_world";
		int start = 1;
		char end = 5;
		System.out.println(s05.substring(start, end));
		
		System.out.println("charAt(), length(), length()-1");
		String s06 = "hello_world";
		System.out.println("charAt(): "+s06.charAt(0));
		System.out.println("length(): "+s06.length());
		int lastindexLength = s06.length()-1;
		System.out.println("length()-1: "+lastindexLength);
		
		String s07 = "abc";
		String s08 = "abc";
		s07.concat(s08);
		System.out.print(s07);
		
		String s09 = "abc";
		StringBuffer s10 = new StringBuffer(s09);
		System.out.println(s09.equals(s10));
			
	}
}
