
## J2W Assignment Test

#Overview

	Write a working program code that will take the test_results.json file as an input and provide: For each test suite:

	- Test suite name
	- Print out the total number of tests that passed and their details
	- Print out the total number of tests that failed and their details
	- Print out the total number of tests that are blocked
	- Print out the total number of tests that took more than 10 seconds to execute	
	- All the detail lists need to be printed in ascending order.
	- Proper treatment for common error conditions


#Solution: 


[ To Get this project running on an Windows machine, install the following: ]

	- Java jdk 8
	- Maven
	- Json Jar File
	- Eclipse IDE 
	- TestNG
	

[ After installation: ]

	- Go to this repository location -(https://github.com/sathyarajr1991/JoulsToWattsAssignment.git) 
	- Tap on Code, Download ZIP file or clone it to Local drive
	- launch Eclipse IDE
	- select 'File -> Import... -> Maven(Existing Maven Projects)'
	- select the 'pom.xml' file of this project.'
	- add TestNG to the build path by right click on @Test tag if Maven build is not added testNG jat file


[ Project layout: ]

	- All Tests contains in this class PrintTestResults.java:
	- PrintTestResults.java has methods to print output to console
	- Logger.java contains all methods formatting in console result 
	- JsonHelper.java parses the test_suite.json file and contains other helper methods
	- test_suite.json file is under /src/main/resources folder
	- the console output is available to view in 'sampleConsoleLog.txt'



[ To execute the test: ]

	- From Eclipse
	    - Under 'Project Explorer', expand J2WAssignments -> 'com.j2wassignment.test' package
	    - Right click on the class PrintTestResults.java and Run as TestNG Test
	    - Right click on testng.xml under Project and Run as TestNG Test
	    

