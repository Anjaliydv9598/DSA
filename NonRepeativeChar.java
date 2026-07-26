package com.dsa.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeativeChar {
	  public static void main(String[] args) {
		  String input = "aabccdeff";

		  Character result = input.chars()                 // take each letter
		      .mapToObj(c -> (char) c)                     // convert to char
		      .collect(Collectors.groupingBy(              // count letters
		          Function.identity(),
		          LinkedHashMap::new,
		          Collectors.counting()
		      ))
		      .entrySet()
		      .stream()
		      .filter(e -> e.getValue() == 1)              // keep only count = 1
		      .map(e -> e.getKey())                        // get character
		      .findFirst()                                 // first one
		      .orElse(null);

		  System.out.println(result);
	    }
}
