package com.abhishek.duplicateInArray;

import java.util.HashMap;
import java.util.Map;

public class Practice {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("java", 1);
	map.put("C#", 2);
	map.put("python", 3);
	
	
	System.out.println(map.get("python"));
}
}
