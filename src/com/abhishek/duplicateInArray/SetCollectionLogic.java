package com.abhishek.duplicateInArray;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionLogic {

	public void findDuplicateMember(String[] arry) {
		
		Set<String> set = new HashSet<String>();
		
		for(int i =0; i< arry.length; i++) {
			
			if(set.add(arry[i]) == false) {
				
				System.out.println("duplicate member in an array is: "+arry[i]);
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		SetCollectionLogic sL = new SetCollectionLogic();
		String[] progLan = {"Java", "javascript", "C#", "C++", "Java", "javascript"};
		
		sL.findDuplicateMember(progLan);
	}
	
}
