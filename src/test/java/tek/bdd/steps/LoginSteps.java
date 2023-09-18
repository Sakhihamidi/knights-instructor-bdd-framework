package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {

    @Then("Validate login section title {string}")
    public void validateLoginSectionTitle(String expectedSectionTitle) {
       String actualSectionTitle = getElementText(LoginPage.SECTION_TITLE);
        Assert.assertEquals("Validate LoginSection title",
                expectedSectionTitle,
                actualSectionTitle);
    }
}
