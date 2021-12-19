package com.core.oops;

public class TestAB implements B1, A1 {
	public static void main(String args[]) {
		System.out.println("Name=" + A1.name);
		
	}

	@Override
	public void m1() {
		System.out.println("m1() method");
	}
}