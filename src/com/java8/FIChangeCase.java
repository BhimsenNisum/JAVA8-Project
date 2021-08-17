package com.java8;

import java.util.function.Consumer;


/**
 * Problem Statement:Write a program to define functional interface which will convert input string to lowercase.
 * 
 * @author bthombre
 *
 */
public class FIChangeCase {

	/**
	 * This is the main method for functional interface which will convert input string to lowercase.
	 * 
	 *  @param args unused.
	 */
	public static void main(String[] args) {
		Consumer<String> consumer = (String value) -> {
			System.out.println(value.toLowerCase());

		};
		consumer.accept("WELCOME TO INDIA");


	}

}


