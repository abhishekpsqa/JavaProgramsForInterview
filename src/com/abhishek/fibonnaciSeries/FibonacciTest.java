package com.abhishek.fibonnaciSeries;

public class FibonacciTest {

	// Fibonacci series of 1st 10 numbers.

	public static void fibonacciOf10No() {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(0+","+1+",");
		for (int i = 0; i < 10; i++) {

			int thirdNumber = firstNumber + secondNumber; // 1
			System.out.print(thirdNumber + ",");

			firstNumber = secondNumber; // 1
			secondNumber = thirdNumber; // 1

		}

	}

	public static void main(String[] args) {

		FibonacciTest.fibonacciOf10No();
	}

}
