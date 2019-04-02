package com.pidal.mavenTDD;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ParameterizedTests {

	private Calculadora c;
	private int a, b, expected;
	
	public ParameterizedTests(int a, int b, int expected) {
		super();
		
		this.a = a;
		this.b = b;
		this.expected = expected;
		
		c = new Calculadora();
		
		System.out.println("Constructor");
	}

	@Parameters
	public static Iterable<Object[]> getData() {
		
		System.out.println("Iterable");
		
		List<Object[]> objects = new ArrayList<Object[]>();
		objects.add(new Object[] {1,2,3});
		objects.add(new Object[] {5,5,10});
		objects.add(new Object[] {0,1,1});
		objects.add(new Object[] {-1,1,0});
		objects.add(new Object[] {-1,-1,-2});
		return objects;
	}
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	public void testSum() {
		c.suma(this.a, this.b);
		assertEquals(this.expected, c.getResult());
		System.out.println("Test");
	}

}
