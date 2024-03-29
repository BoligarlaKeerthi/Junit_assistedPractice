package com.app.junitDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


public class ExtensionsDemoConditions {
	
	@Test
	@EnabledOnOs(OS.MAC)  // Condition to check if my laptops OS is Mac, then execute the test
	public void conditionOS()
	{
		System.out.println("Executed Test cases on Mac");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_14) // check condition to check the Java version in your laptop
	// if java version is 14
	public void conditionJRE()
	{
		System.out.println("Executed Test cases for my Java Version");
	}
	
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_20)
	// check condition to check the Java version in your laptop is within the given range
	public void conditionJRErange()
	{
		System.out.println("Executed Test cases on machine with java version 11 to 20");
	}
	
	
	
	
}


