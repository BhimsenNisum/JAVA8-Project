package com.java8;

import java.util.Arrays;
import java.util.List;


/**
 * Problem Statement: Write a java8 program to find all the even numbers exist in the list.
 * 
 * @author bthombre
 *
 */

public class EvenNumber {
	
	 /**
     * This is the main method used  to find all the even numbers exist in the lis.
     * 
     *  @param args unused.
    */
	public static void main(String[] args) {
		Integer[] Numbers = {11,12,22,15,86,56,33,64,99,35,65};
		
		//convert array to list
		List<Integer> numberList = Arrays.asList(Numbers);

		//use stream and lambda expression to filter list and forEach print
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
	}
}
