package com.abhishek.isPerfect;

public class PerfectNTest {

	public static void isPerfect(int num) {

		// perfect number is sum of all the factors of a number equals to that number
		// eg facotors of 6 are 1+2+3 which equals to 6 hence 6 is perfect number.

		int sumOfFactors = 0;
		for (int i = 1; i < num; i++) {

			if (num % i == 0)

				sumOfFactors = sumOfFactors + i;

		}
		if (sumOfFactors == num)
			System.out.println(num + " is a perfect number");

	}

	public static void main(String[] args) {
		PerfectNTest.isPerfect(28);
	}

}
