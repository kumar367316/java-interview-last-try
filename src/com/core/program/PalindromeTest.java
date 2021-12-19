package com.core.program;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Number:");
		int nbr = scan.nextInt();
		int sum=0;
	    int temp = nbr;
	    int remind = 0;
		
		while(nbr > 0) {
			remind = nbr % 10;
			sum = (sum*10)+remind;
			nbr = nbr / 10;
		}
		
		if(sum == temp)
			System.out.println("This is a palidrome");
		else
			System.out.println("This is not a palidrome");

	}

}
