package com.core.program;

class Base1 extends Parent1{
	
	static {
		System.out.println("static block of Base");
	}
	
	public Base1() {
		System.out.println("base class constructor");
	}
}


public class JavaClassExecution {

	public static void main(String[] args) {
		//new Base1();
		  new Parent1(); 
	}

}
