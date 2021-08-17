package com.java8;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Problem Statement: Write a java8  program to find the first non-repeated character in it.
 * 
 * @author bthombre
 *
 */

public class NonRepeatChar {

	 /**
	    * This is the main method used  to  program to find the first non-repeated character in it.
	    * 
	    *  @param args unused.
	   */
	
	public static void main(String[] args) {
		 
	    System.out.println("  Please  enter  the  input  string  :");
	    Scanner scanner = new Scanner(System.in); // read from System input
	    String input = scanner.nextLine();
	    Character firstNonRepeatedChar = logic(input);
	    System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
	    scanner.close();
	  }
	 
	  private static Character logic(String input) {  
	        Character result =  input.chars()      //string stream
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) //convert to lowercase & then to Character object
	             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
	             .entrySet().stream()
	             .filter(entry -> entry.getValue() == 1L)
	             .map(entry -> entry.getKey())
	             .findFirst().get();
	        
	         return result;  
}
}