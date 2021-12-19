package com.core.map;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer key1 = 1234;
		String  key2 = "1234";        
		HashMap map1 = new HashMap();
		map1.put(key1, "RAM");
		map1.put(key2, "VIJAY");    
		System.out.println(map1); 
		
		
		Integer key11 =  new Integer(1234);
		Integer key12 = new Integer("1234");
		HashMap map2 = new HashMap();       
		map2.put(key11, "RAM1");       
		map2.put(key12, "VIJAY1");    
		System.out.println(map2); 
	}

}
