package main.java.com.arithmetic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Comp {
	
	public static void compress(String str){
		
		int length = str.length();
		char[] strArray = str.toCharArray();
		LinkedHashMap<Character,Integer> CharCountMap = new LinkedHashMap<Character,Integer>();
		char key;
		StringBuilder compressedString= new StringBuilder();
		
		if(length>0 && length <1024){
			
			for(int i=0;i<length;i++){
				key = strArray[i];
				if(!CharCountMap.containsKey(key)){
					CharCountMap.put(key, 1);
				}
				else{
					CharCountMap.put(key,CharCountMap.get(key)+1);
				}
			}
		
			for(Map.Entry<Character,Integer> entry:CharCountMap.entrySet()){
				
				char charKey = entry.getKey();
				int charCount = entry.getValue();
				compressedString.append(charKey);
				if(charCount>1)
					compressedString.append(charCount);
			}
		}
		
		System.out.print(compressedString.toString());
	}
	
	public static void main(String[] args) {
		
		compress("");
	}
	
	

}
