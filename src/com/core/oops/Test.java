package com.core.oops;

class A {
	void m1() throws IOException {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() throws Exception {
		System.out.println("In m1 B");
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new B();
		try {
			a.m1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}