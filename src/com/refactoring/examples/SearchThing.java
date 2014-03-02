package com.refactoring.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchThing {

	
	public static void main(String[] v){
		System.out.println(" ");
		String[] numbers = {"0","1","2","3","4"};
		
		List<Integer> integers = new ArrayList<>();
		for(String number : numbers){
			integers.add(Integer.valueOf(number));
		}
		
		System.out.println( Collections.binarySearch(integers, 4,comp));
	}		
		static Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				return i < j ? -1 : (i==j) ? 0 : 1;
			}
			
		};
		
		
		
		
	
}
