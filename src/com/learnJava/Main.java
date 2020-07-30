package com.learnJava;

import java.util.Scanner;

public class Main {
	/**
	 * Read the numbers from the console entered by the user and print the minimum and maximum number the user
	 * has entered
	 * 
	 * Before the user enters the number, print the message "Enter number"
	 * 
	 * If the user enters an invalid number, break out of the loop and print the minimum and maximum number
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		boolean firstNumber = true;
		
		while(true) {
			System.out.println("Enter number:");
			
			boolean validateNumber = scanner.hasNextInt();
			if(validateNumber) {
				int number = scanner.nextInt();
				
				if(firstNumber) {
					min = number;
					max = number;
					firstNumber = false;
				}
				if(number < min) {
					min = number;
				}
				if(number > max) {
					max = number;
				}
				
			} else {
				break;
			}
		}
		scanner.close();
		
		System.out.println("Maximum number is " + max);
		System.out.println("Minimum number is " + min);
	}

}
