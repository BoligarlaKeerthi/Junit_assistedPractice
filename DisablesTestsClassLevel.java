package com.app.junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Functionalty is not working, ignoring the tests")

public class DisablesTestsClassLevel {
	
	@Test
	public void method1()
	{
		System.out.println("Executing method 1 of code class");
	}
	
	@Test
    
	public void method2()
	{
		System.out.println("Executing method 2 of code class");
	}
	
	@Test
	 
	public void method3()
	{
		System.out.println("Executing method 3 of code class");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Executing method 4 of code class");
	}


}


