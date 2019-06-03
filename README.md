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




         Test-Output
                |_index.html
                
   Configure TestRunner.java :   Change below path of feature file to your local folder
                @CucumberOptions(
		features="C:/Users/Dalia/SelJava/automationAssignment/src/test/resources/net/anz/ui/feature/anz.feature",
		glue= {"net/anz/ui/stepDefinitions"},
    
    
