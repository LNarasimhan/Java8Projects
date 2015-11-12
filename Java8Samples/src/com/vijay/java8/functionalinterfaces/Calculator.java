package com.vijay.java8.functionalinterfaces;

/**
 * Functional Interface annotation ensures that there is only one abstract
 * method used in the interface which is needed while executing lambda
 * expressions.
 * 
 * @author vijay
 *
 */
@FunctionalInterface
public interface Calculator {

	public abstract int sqrt(String input);

	/**
	 * Default methods are still allowed in functional interface.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public default int add(int a, int b) {
		return a + b;
	}
}
