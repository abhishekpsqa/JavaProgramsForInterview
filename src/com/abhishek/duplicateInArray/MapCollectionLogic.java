package com.abhishek.duplicateInArray;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionLogic {

	public void findDuplicateMember(String[] arry) {
		//
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i< arry.length; i++) {
			int counter =1;
			if(map.get(arry[i]) == null) {
				
				map.put(arry[i], 1);
			}
			else {
				
				map.put(arry[i], ++counter);
			}
			
		}
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			
			if(m.getValue() > 1) {
				
				System.out.println("The duplicate word is :"+m.getKey());
			}
		}
				
	}
	
	public static void main(String[] args) {
		String[] progLan = {"Java", "javascript", "Java", "Java", "javascript"};
		MapCollectionLogic mC = new MapCollectionLogic();
		mC.findDuplicateMember(progLan);
	}
	
	
	
}
