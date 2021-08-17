package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Problem Statement: Write a java8 program to find duplicate elements in a given integers list.
 * 
 * @author bthombre
 *
 */
public class DuplicateInt {
	
	
	  public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

	        Set<T> items = new HashSet<>();
	        return list.stream()
	                .filter(n -> !items.add(n)) //Set.add() returns false if the element was already in the set.
	                .collect(Collectors.toSet());

	    }


		 /**
	     * This is the main method used to find duplicate elements in a given integers list.
	     * 
	    */
	  public static void main(String[] args) {

	        // 3, 4, 9
	        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

	        Set<Integer> result = findDuplicateBySetAdd(list);

	        result.forEach(System.out::println);

	    }

	  
	
}
