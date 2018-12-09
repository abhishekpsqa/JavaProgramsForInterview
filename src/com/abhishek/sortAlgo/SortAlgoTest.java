package com.abhishek.sortAlgo;

public class SortAlgoTest {

	public void sortThisArray() {

		int[] digits = { 8, 1, 6, 4, 3, 2 };

		for (int i = 0; i < digits.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < digits.length; j++) {

				if (digits[j] < digits[minIndex]) {

					minIndex = j;
				}
			}
			
			int temp = digits[i];
			digits[i] = digits[minIndex];
			digits[minIndex] = temp;

		}

		for (int n : digits) {
			 System.out.print(n + ",");
		}

	}

	public static void main(String[] args) {

		SortAlgoTest sa = new SortAlgoTest();
		sa.sortThisArray();
	}
}
