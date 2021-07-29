package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd1() {

		int res=new Calculator().add(10,20);
		assertEquals(30,res);
	}
	
	@Test
	public void testAdd2() {

		int res=new Calculator().add(-10,20);
		assertEquals(10,res);
	}

	@Test
	public void testProd1() {

		int res=new Calculator().prod(1,3);
		assertEquals(3,res);
	}

	@Test
	public void testProd2() {

		int res=new Calculator().prod(2,3);
		assertEquals(6,res);
	}


}
