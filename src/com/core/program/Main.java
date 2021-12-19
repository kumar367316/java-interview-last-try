package com.core.program;

class Base {
	public static void show() {
		System.out.println("Base::show() called");
	}
}

class Derived extends Base {
	public static void show() {
		System.out.println("Derived::show() called");
	}
}

class Main {
	public static void main(String[] args) {
		//Derived d = new Base(); //error becoz child class reference can't hold parent object
		Base b = new Derived();
		b.show();
	}
}