package com.core.string;

public class HeapSCPMemoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
	}

}
