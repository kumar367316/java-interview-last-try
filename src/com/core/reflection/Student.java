package com.core.reflection;

import javax.annotation.Resource;

@Deprecated
@Resource
public class Student {
	
	private int redgNo;
	private String name;
	
	public Student(int redgNo, String name) {
		this.redgNo = redgNo;
		this.name = name;
	}

	public int getRedgNo() {
		return redgNo;
	}

	public void setRedgNo(int redgNo) {
		this.redgNo = redgNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [redgNo=" + redgNo + ", name=" + name + "]";
	}
	
	public void studentInfo() {
		System.out.println("studentInfo method");
	}
	
	public void studentRollNo(int a,int b) {
		System.out.println("studentRollNo method");
		System.out.println("sum:"+a+b);
	}
}