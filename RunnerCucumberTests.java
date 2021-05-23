package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(dryRun=false,features= {"src/test/java/features"},glue={"stepdef"},monochrome=true)

//@CucumberOptions(dryRun=false,features= {"src/test/java/features/Delete.feature"},glue={"stepdef"},monochrome=true)
@CucumberOptions(dryRun=false,features= {"src/test/java/features/Duplicate.feature"},glue={"stepdef"},monochrome=true)
		

public class RunnerCucumberTests extends AbstractTestNGCucumberTests {
	

}
