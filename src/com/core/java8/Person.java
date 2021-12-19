package com.core.java8;

public class Person {
	
	private int aadhaarId;
	private String name;
	private int age;
	
	public Person(int aadhaarId, String name, int age) {
		this.aadhaarId = aadhaarId;
		this.name = name;
		this.age = age;
	}
	public int getAadhaarId() {
		return aadhaarId;
	}
	public void setAadhaarId(int aadhaarId) {
		this.aadhaarId = aadhaarId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [aadhaarId=" + aadhaarId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
