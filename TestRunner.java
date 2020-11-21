package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features={"src/test/java/features/"},
                 glue={"stepDefinition"},
                 plugin = { "pretty", "html:test-output","junit:junit_xml/junit.xml" }, 
                 monochrome = true, 
                 dryRun = false, // check all the steps have the definitions and will not execute
                 strict = true, 
                 tags = {"@tag1,@tag2,@tag3,@tag4"}) // check if any step is not defined in step definition file
         
public class TestRunner extends AbstractTestNGCucumberTests{
}

