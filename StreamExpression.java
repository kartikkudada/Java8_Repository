package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExpression {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("b","d","a","i","g","o","q","j");
		//toupper case in  Arraylist of strings
		System.out.println("\nBefore java 8");
		List<String> listUpper = new ArrayList<>();
		for(String s:list){
			listUpper.add(s.toUpperCase());
		}
		
		System.out.println("\nAfter java 8");
		List<String> listUpper8 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(listUpper8);
		
		System.out.println("multiplying every elements of list in java8, Just a single line of code");
		List<Integer> numbers = Arrays.asList(1,5,6,7,3,6,10);
		List<Integer> numbersJava8 = numbers.stream().map(num -> num*2).collect(Collectors.toList());
		System.out.println(numbersJava8);
		
	}
}
