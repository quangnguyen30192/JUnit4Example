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
public class DivTest {

  @Before
  public void setUp() {
    System.out.println("Install before processing each test case");
  }

  @After
  public void tearDown() {
    System.out.println("Unistall after processing each test case");
  }

  @BeforeClass
  public static void setUpClass() {
    System.out.println("Starting unit test");
    System.out.println("Install the class's utilities once before class initialized");
  }

  @AfterClass
  public static void tearDownClass() {
    System.out.println("Uninstall after the class run and finished");
    System.out.println("Finished unit test");
  }

  @Test
  public void testDivIntFail() {
    // add test code here
    assertNotEquals(2, Calculator.divInt(6, 2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testDivIntException() {
    Calculator.divInt(7, 0);
  }

  @Test(timeout = 1000)
  public void testTimeOut() {
    while (true) {
    }
  }
}