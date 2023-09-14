package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.bdd.utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {
    //This is Hook will be executed by cucumber
    //before and after each scenario
    @Before
    public void setUpTests() {
        openBrowser();
    }

    @After
    public void cleanUpTests() {
        driverQuit();
    }
}
