package com.java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {

				
		List<Developer> listDevs = getDevelopers();
		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		// Before Java 8 
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		// After Java 8 		
		System.out.println("After Java 8  / sort by name \n");
		listDevs.sort((Developer d1,Developer d2)-> d1.getName().compareTo(d2.getName()));
		listDevs.forEach((Developer d) -> System.out.println(d));
		
		System.out.println("\nAfter java 8 / sort by age \n");
		listDevs.sort((Developer d1,Developer d2)->d1.getAge() - d2.getAge());
		listDevs.forEach((Developer d) -> System.out.println(d));
		
	}

	private static List<Developer> getDevelopers() {
		List<Developer> list = new ArrayList<Developer>();
		list.add(new Developer("kartik",30));
		list.add(new Developer("Amir khan",40));
		list.add(new Developer("Shahruk khan",45));
		list.add(new Developer("salman khan",43));
		list.add(new Developer("Akshay kumar",44));
		return list;
	}

}



class Developer {
	private String name;
	private int age;
	
	public Developer() {}
	public Developer(String name,int age) {	
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
}