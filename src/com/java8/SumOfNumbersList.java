package com.java8;

import java.util.ArrayList;
import java.util.List;



/**
 * Problem Statement: Write a java8 program to Summing Numbers in a given integers list.
 * 
 * @author bthombre
 *
 */
public class SumOfNumbersList {
	

	 /**
    * This is the main method used  to Summing Numbers in a given integers list.
    * 
    *  @param args unused.
   */
	  public static void main(String[] args)
	    {
	        // create a list of integers
	        List<Integer> list = new ArrayList<Integer>();
	 
	        // add elements to the list
	        list.add(1);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);
	        list.add(10);
	 
	        System.out.println(sum(list));
	    }
	 
	    public static int sum(List<Integer> list)
	    {
	        // create a stream of integers
	        // filter the stream
	        // add the integers
	        return list.stream()
	            .filter(i -> i >=1 )
	            .mapToInt(i -> i)
	            .sum();
	    }

}
