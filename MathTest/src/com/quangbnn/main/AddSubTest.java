package com.quangbnn.main;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CalculatorTest</code> contains tests for the class
 * <code>{@link Calculator}</code>.
 *
 * @generatedBy CodePro at 10:03 01/05/2016
 * @author QuangNguyen
 * @version $Revision: 1.0 $
 */
public class AddSubTest {

	@Test
	public void testAddPass() {
		assertEquals(3, Calculator.add(1, 2));
		assertEquals(4, Calculator.add(2, 2));
		assertEquals(5, Calculator.add(3, 2));
	}

	@Test
	public void testAddFail() {
		assertNotEquals(0, Calculator.add(1, 2));
	}

	@Test
	public void testSubPass() {
		assertEquals("error in sub()", 1, Calculator.sub(2, 1));
		assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
		assertEquals("error in sub()", 0, Calculator.sub(2, 2));
	}

	@Test
	public void testSubFail() {
		assertNotEquals("error in sub()", 0, Calculator.sub(2, 1));
	}
}