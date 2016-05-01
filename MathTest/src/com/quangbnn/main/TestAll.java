package com.quangbnn.main;

import java.util.concurrent.TimeUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 10:03 01/05/2016
 * @author QuangNguyen
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AddSubTest.class, DivTest.class, AddTestWithMultParam.class})
public class TestAll {

  private static final boolean ISPRINTTRACE = false;

  public static void main(String[] args) {
    Result rs = JUnitCore.runClasses(new Class[] { TestAll.class });
    System.out.println(String.format("Total run in: %d min, %d sec",
                                     TimeUnit.MILLISECONDS.toMinutes(rs.getRunTime()),
                                     TimeUnit.MILLISECONDS.toSeconds(rs.getRunTime()) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(rs.getRunTime()))));
    if (rs.wasSuccessful()) {
      System.out.println("RESULT: SUCCESS");
      System.out.println("All test cases are OK!");
      System.out.println("-------------------------------------------------------");
      printStatistics(rs);
    } else {
      System.out.println("RESULT: FAILURE");
      System.out.println("Please review the logs below: ");
      System.out.println("-------------------------------------------------------");
      printStatistics(rs);
      System.out.println("-------------------LOGGER------------------------------------");
      int i = 1;
      for (Failure failure : rs.getFailures()) {
        System.out.println(String.format("Test case %d", i++));
        System.out.println(String.format("     HEADER: %s", failure.getTestHeader()));
        System.out.println(String.format("     MESSAGE: %s", failure.getMessage()));
        System.out.println(String.format("     EXCEPTION: %s", failure.getException().toString()));
        if (ISPRINTTRACE) {
          System.out.println(String.format("     TRACE: %s", failure.getTrace()));
        }
        System.out.println();
      }
    }
  }

  private static void printStatistics(Result rs) {
    System.out.println(String.format("Total: %d test case(s) run", rs.getRunCount()));
    System.out.println(String.format("       %d test case(s) passed",
                                     rs.getRunCount() - (rs.getFailureCount()
                                                         + rs.getIgnoreCount())));
    System.out.println(String.format("       %d test case(s) failed", rs.getFailureCount()));
    System.out.println(String.format("       %d test case(s) ignored", rs.getIgnoreCount()));
  }
}
