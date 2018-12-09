package com.abhishek.stringCompression;

public class StringCompression {

	
	//got String[] photo = {"a","a","a","b","b","c"} print it as a3b2c1
	//for
	//counter
	//counter reset
	//if else condition
	
	
	public void compressString() {
		
		String[] photo = {"a","a","a","b","b","c"};
		
		int counter =1;
		String temp = photo[0];
		
		for (int i =0; i< photo.length-1; i++) {
			
			if(temp.equals(photo[i+1])) {
				counter++;		
			}
			
			else {
				
				System.out.print( temp+""+counter);
				counter =1;
				temp = photo[i+1];
			}
		}
		
		System.out.print(photo[photo.length -1]+""+counter);
	}
	
	public static void main(String[] args) {
		StringCompression st = new StringCompression();
		st.compressString();
	}
	
}
