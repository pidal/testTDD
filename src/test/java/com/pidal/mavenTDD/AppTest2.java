package com.pidal.mavenTDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

// https://junit.org/junit4/

// https://github.com/junit-team/junit4/wiki/Assertions

// https://github.com/junit-team/junit4/wiki/Aggregating-tests-in-suites

// https://github.com/junit-team/junit4/wiki/Parameterized-tests

// https://github.com/junit-team/junit4/wiki/Exception-testing

// Explicar Maven test. Clase de tests.

// Extra

// Before vs Constructor
// https://stackoverflow.com/questions/6094081/junit-using-constructor-instead-of-before

// https://github.com/junit-team/junit4/wiki/Timeout-for-tests

public class AppTest2 {
	
	private Calculadora c;
	
	public AppTest2() {
		System.out.println("Constructor");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {		
		c = new Calculadora();
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	
	@Test
	public void test() {
		c.suma(2, 3);
		assertEquals(5, c.getResult());
		System.out.println("Test");
		
		boolean x = false;
		
		assertFalse("x no puede ser false", x);
		assertEquals(x, false);
		
	}
	
	@Test
	public void test2() {
		c.suma(2, 5);
		assertEquals(7, c.getResult());
		System.out.println("Test2");
	}
	

}
