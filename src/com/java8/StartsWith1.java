package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Problem Statement: Write a program to find all the numbers starting with 1.
 * 
 * @author bthombre
 *
 */
public class StartsWith1 {

	 /**
	    * This is the main method used  to find all the numbers starting with 1.
	    * 
	    *  @param args unused.
	   */
	public static void main(String[] args) {

		// initialising List and Storing values.
		List<Integer> list = Arrays.asList( 1, 2, 13, 4, 15 );


		// integers in a list which are converting into the string.

		List<String> newList = list.stream().map(s -> String.valueOf(s))
				                            .collect(Collectors.toList());
		System.out.println(newList);

		long count = newList.stream().filter(x -> x.startsWith("1"))
				                     .count();
		System.out.println("Integer's which are starting with one is ::  " +count);
	}
}
