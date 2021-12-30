package com.core.designpattern.singleton;

public class Logger {
	public void success(String message) {
		System.out.println(String.format("SUCCESS %s", message));
	}

	public void failure(String message) {
		System.out.println(String.format("FAILURE %s", message));
	}
}
