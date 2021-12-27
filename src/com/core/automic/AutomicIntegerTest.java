package com.core.automic;

import java.util.concurrent.atomic.AtomicInteger;

public class AutomicIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AtomicInteger counter = new AtomicInteger(100);
		counter.addAndGet(2);
		System.out.println(counter);

	}

}
