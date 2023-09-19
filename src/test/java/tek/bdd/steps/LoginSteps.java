package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Then("Validate login button is {string}")
    public void validateLoginButtonDisabledOrEnabled(String expectedCondition) {
        boolean actualCondition = isElementEnabled(LoginPage.LOGIN_BUTTON);

        if (expectedCondition.equalsIgnoreCase("enabled")) {
            Assert.assertTrue("Login button should be enabled", actualCondition);
        } else if (expectedCondition.equalsIgnoreCase("disabled")) {
            Assert.assertFalse("Login button should be disabled", actualCondition);
        }
    }
    @When("Enter username as {string}")
    public void enterUsername(String username) {
        enterValue(LoginPage.USERNAME, username);
    }

    @When("Enter password as {string}")
    public void enterPassword(String password) {
        enterValue(LoginPage.PASSWORD, password);
    }
}
