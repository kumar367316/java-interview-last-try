package com.core.program;

import java.util.Scanner;

class ShowCharacterInAlphabetics {
	public static void main(String[] args) {
		// 1
		Scanner scanner = new Scanner(System.in);

		// 2
		System.out.println("Enter a string : ");
		String userInput = scanner.nextLine();

		// 3
		char[] charArray = userInput.toCharArray();

		// 4
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}

		// 6
		System.out.println("Sorted string " + String.valueOf(charArray));
	}


}