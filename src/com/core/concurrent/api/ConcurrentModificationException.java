package com.core.concurrent.api;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap with Country as key and capital as value
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		// Iterating java iterator
		System.out.println("Iterating java Iterator");
		Iterator<String> countryKeySetIterator = map.keySet().iterator();
		while (countryKeySetIterator.hasNext()) {
			String countryKey = countryKeySetIterator.next();
			map.put("Nepal", "KathMandu");
			System.out.println(countryKey);
		}

	}

}
