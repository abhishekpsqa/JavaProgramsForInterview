package com.abhishek.bubbleSort;

public class BubbleSort {

	public static void doBubbleSort(int[] value) {
		int temp;
		for (int i = 0; i < value.length; i++) {
			for (int j = i + 1; j < value.length; j++) {
				if (value[i] > value[j]) {
					temp = value[i];
					value[i] = value[j];
					value[j] = temp;
				}

			}
		}
		for (int z = 0; z < value.length; z++) {

			System.out.print(value[z] + ",");
		}
	}

	public static void main(String[] args) {
		int[] value = { 5, 6, 9, 11, 3, 2 };
		doBubbleSort(value);
	}

}
