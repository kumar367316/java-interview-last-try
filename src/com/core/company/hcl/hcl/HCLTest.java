package com.core.company.hcl.hcl;

import java.util.HashMap;

public class HCLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap with Country as key and capital as value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		// Iterating java iterator
		System.out.println("Iterating java Iterator");
		for (String countryKey : map.keySet()) {
			map.put("Nepal", "KathMandu");
			System.out.println(countryKey);
		}

	}

}
