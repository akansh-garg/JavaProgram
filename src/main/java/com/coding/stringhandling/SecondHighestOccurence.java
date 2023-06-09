package com.coding.stringhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestOccurence {
	
	public static void main(String[] args) {
		
		String input = "Thiruvanathapuram";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for (char character : input.toCharArray()) {
			if (map.get(character) != null) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}

		System.out.println(map);
		List<Integer> integer = new ArrayList<Integer>(map.values().stream().collect(Collectors.toSet()));
		Collections.sort(integer);
		for(Character c : map.keySet()) {
			if(map.get(c) == integer.get(integer.size()-2)) {
				System.out.println(c);
			}
		}
	}
}
