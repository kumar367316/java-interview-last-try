package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nameList= new ArrayList<>();
		nameList.add("Kumar");
		nameList.add("Kishore");
		nameList.add("Smith");
		nameList.add("Scott");

		nameList.add("CapgeminiTest");
		nameList.add(2,"abc");
		
		List<String> kNamesLiost = 
				nameList.stream().filter(name->name.startsWith("K")).collect(Collectors.toList());
		
		System.out.println("k name list:"+kNamesLiost);

	}

}
