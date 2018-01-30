package com.java8.features;

interface FunctionalInterface {

	public void method(int value);
}

interface FunctionalInterface_with_Simplemethod<T>
{
	public  void method(T s);
}

interface FunctionalInterface_with_Returnmethod<T>
{
	public T method(T s);
}

public class Java8Features {

	public static void main(String[] args) {
		
		//Simple functional interface 
		FunctionalInterface foo = (x)->{System.out.println("Test " + x);};
		foo.method(100);
		
		// Functional Interface with generic method
		FunctionalInterface_with_Simplemethod foo1 =
				(x)->{System.out.println(x +" " + x);};
		foo1.method("HERO");
		foo1.method(100);
		
		//Functional interface with generic method which returns value
		FunctionalInterface_with_Returnmethod foo2 = 
				(x) ->{return x;};
		System.out.println(foo2.method("HERO"));		
	}

}
