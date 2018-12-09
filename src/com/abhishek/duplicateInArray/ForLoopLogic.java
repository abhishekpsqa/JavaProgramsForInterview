package com.abhishek.duplicateInArray;

public class ForLoopLogic {

	public void findDuplicateMember(String[] array) {

		// use two for loops. Not efficient.

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i].equals(array[j])) {

					System.out.println("duplicate member in array is: " + array[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		String[] progLan = { "Java", "javascript", "C#", "C++", "Java", "javascript", "pascal" };

		ForLoopLogic forL = new ForLoopLogic();
		forL.findDuplicateMember(progLan);

	}
}
