package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.fedcm.model.Account;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.pages.AccountsPage;
import tek.bdd.utility.SeleniumUtility;

import java.time.Duration;
import java.util.List;

public class AccountsSteps extends SeleniumUtility {

    @Then("Validate accounts table have {int} rows")
    public void validateAccountTableRows(int expectedRows) {
        List<WebElement>  tableRowsElements = getListOfElements(AccountsPage.TABLE_ROWS);
        Assert.assertEquals("Validate Account Table row " ,
                expectedRows,
                tableRowsElements.size());
    }

    //TODO Failed due to stale element while calling step multiple time
    @When("change item per page to {string}")
    public void changeItemPerPage(String itemPerPage) {
        //Click to open the dropdown
        clickOnElement(AccountsPage.ITEM_PER_PAGE_SELECT);
        selectFromDropDown(AccountsPage.ITEM_PER_PAGE_OPTIONS, itemPerPage);
    }
}
