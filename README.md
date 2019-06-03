# This is a sample project to automated tests covering various use cases to verify that borrowing calculator on 
https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow page is working properly and to make sure that the calculator continues to work as they make other changes to the page.

#Pre-requisites
Java
Maven
Eclipse
Eclipse Plugins
Cucumber

#My Framework
https://github.com/DaliaBarman/assignment

automationAssignment
	|
	|_src/main/java	
	|       |_net.anz.ui.pages
	|       |       |_HomePage.java
	|       |	
	|	      |_net.anz.ui.runner
	|	      |	      |_TestRunner.java
  |       |
  |       |_net.anz.ui.testbase
  |       |       |_TestBase.java
  |       |
  |       |_net.anz.ui.utility
  |       |       |_Utility.java
  |       |   
	|_src/test/java
	|	      |_net.anz.ui.stepDefinitions
	|	     |	       |_HomePageSteps.java
	|	     |	
	|_src/test/resources
	|	     |_net.anz.ui.feature
	|	     |	      |_anz.feature


         Test-Output
                |_index.html
                
   Configure TestRunner.java :   Change below path of feature file to your local folder
                @CucumberOptions(
		features="C:/Users/Dalia/SelJava/automationAssignment/src/test/resources/net/anz/ui/feature/anz.feature",
		glue= {"net/anz/ui/stepDefinitions"},
    
    
