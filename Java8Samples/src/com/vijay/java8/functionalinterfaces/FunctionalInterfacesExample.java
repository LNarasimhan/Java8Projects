package com.vijay.java8.functionalinterfaces;

public class FunctionalInterfacesExample {

	public static void main(String[] args) {
		Calculator c = (input) -> Integer.valueOf(input);
		int val = c.doSomething("10");
		System.out.println(val);
		
		// Method Reference of static methods.
		// Same can be done for object methods as well.
		c = Integer::valueOf;
		val = c.doSomething("25");
		System.out.println(val);
	}
}
