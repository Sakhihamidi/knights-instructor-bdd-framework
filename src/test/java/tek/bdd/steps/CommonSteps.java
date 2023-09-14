package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {

    @Given("Open browser and navigate")
    public void openBrowserAndNavigate() {
        openBrowser();
    }

    @Then("Validate application title should be {string}")
    public void validateApplicationTitle(String expectedAppTitle) {
        //To Validate we can use JUnit Assert Class org.junit.Assert,
        String actualAppTitle = getDriver().getTitle();

        Assert.assertEquals("Application Title Validation",
                expectedAppTitle,
                actualAppTitle);
    }

    @Then("Close browser")
    public void closeBrowser() {
        driverQuit();
    }
}
