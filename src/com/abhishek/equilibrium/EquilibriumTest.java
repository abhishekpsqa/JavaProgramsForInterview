package com.abhishek.equilibrium;

public class EquilibriumTest {

	public static void getEquilibriumPoint() {

		//int[] arry = { 2, 4, 4, 5, 4, 1 };
		int[] arry = { 6,2,2,2 };
		int startIndex = 0;
		int endIndex = arry.length - 1;
		int rightSum = 0;
		int leftSum = 0;
		boolean eqNotFound = true;

		while (eqNotFound) {

			if (leftSum > rightSum) {
				rightSum += arry[endIndex--];
			} else {
				leftSum += arry[startIndex++];
			}

			if (startIndex > endIndex) {

				if (rightSum == leftSum) {
					System.out.println("The index found is: "+startIndex);
					break;
				} else {
					System.out.println("wrong arry...!");
					eqNotFound = false;
				}
			}
		}

	}

	public static void main(String[] args) {
		EquilibriumTest.getEquilibriumPoint();
	}

}
