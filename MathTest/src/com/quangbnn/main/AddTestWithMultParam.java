/**
 * 
 */
package com.quangbnn.main;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * The class <code>DivTest</code> contains tests for the class {@link
 * <code>Calculator</code>}
 *
 * @pattern JUnit Test Case
 *
 * @generatedBy CodePro at 10:53 01/05/2016
 *
 * @author QuangNguyen
 *
 * @version $Revision$
 */
@RunWith(Parameterized.class)
public class AddTestWithMultParam {

  private int paramA; // Test fixtures
  private int paramB; // Test fixtures
  private int result; // Test fixtures

  @Parameters
  // Feed inputs to constructor
  public static Iterable<Object[]> data() {
    System.out.println("Run parameter");
    return Arrays.asList(new Object[][] { { 1, 1, 2 },
                                          { 1, 2, 3 },
                                          { 1, 2, 4 },
                                          { 1, 1, 2 },
                                          { 1, 2, 3 },
                                          { 1, 2, 5 },
                                          { 1, 2, 5 }});
  }

  // Constructor
  // For each test, this constructor gets its inputs from
  // the @Parameters method to setup the test fixtures.
  public AddTestWithMultParam(int paramA, int paramB, int result) {
    this.paramA = paramA;
    this.paramB = paramB;
    this.result = result;
  }

  /**
   * Run the int divInt(int, int) method test
   */
  @Test
  public void testAddIntPass() {
    // add test code here
    assertEquals(result, Calculator.add(paramA, paramB));
    assertEquals(result, Calculator.add(paramA, paramB));
    assertEquals(result, Calculator.add(paramA, paramB));
  }
}