package com.core.program;

class Car {
	public Car() {
		System.out.println("Car class constructor called");
	}
}

class Hyundai extends Car {
	public Hyundai() {
		System.out.println("Hyundai class constructor called");
	}
}

public class ChildParentClassTest {

	public static void main(String[] args) {
	
		Hyundai hundai = new Hyundai();
		

	}

}
