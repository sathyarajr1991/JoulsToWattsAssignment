package com.j2wassignment.test;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import java.io.IOException;

/**
 * Created by Sathyaraj on 2023-01-19.
 * This class holds the main method, and defines all methods related to printing output to console
 */

/**
 * Test 1
 Write a working program code that will take the test_results.json file as an input and provide:
 1) For each test suite:
 Test suite name
 Print out the total number of tests that passed and their details
 Print out the total number of tests that failed and their details
 Print out the total number of test that are blocked
 Print out the total number of test that took more than 10 seconds to execute
 2) Proper treatment for common error conditions
 3) All the detail lists need to be printed in ascending order
 */
public class PrintTestResults extends JsonHelper {

	PrintTestResults() throws ParseException, IOException{
		loadJsonTestSuiteFile();
	}
	
	/**
	 * Prints test suite names
	 * @throws Exception
	 */

	@Test(priority = 0)
	public void printAllTestSuiteNames() throws Exception {
		getAllTestSuiteNames();
	}

	/**
	 * Prints list of tests and time duration based on results in alphabetical order
	 * @throws Exception
	 */
	@Test(priority = 1)
	public void printAllTestResultDetails() throws Exception {
		getAllTestsByResultWise(Result.PASS);
		getAllTestsByResultWise(Result.FAIL);
		getAllTestsByResultWise(Result.BLOCKED);
	}

	/**
	 * Prints Passed, Failed, Blocked Test details (test name and duration)
	 * @param executionTime
	 * @throws Exception
	 */
	@Test(priority=2)
	@Parameters("expectedTime")
	public void printAllTestsGreaterThanDuration(Double expectedTime) throws Exception {
		getAllTestsByExecutionTimeWise(expectedTime);
	}
}
