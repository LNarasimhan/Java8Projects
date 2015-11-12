package com.vijay.java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaListExample {

	public static void java7Approach(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	public static void java8Approach(List<String> names) {
		Collections.sort(names, (o1,o2) -> o1.compareTo(o2));
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth");
		java7Approach(names);
		System.out.println("JAVA7:"+names);
		
		names = Arrays.asList("first", "second", "third", "fourth", "fifth", "sixth");
		java8Approach(names);
		System.out.println("JAVA8:"+names);
	}
}
