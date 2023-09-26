package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlansPage;
import tek.bdd.utility.SeleniumUtility;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlansSteps extends SeleniumUtility {

    @Then("Validate Section title is {string}")
    public void validateSectionTitle(String expectedSectionTitle) {
        String actualSectionTitle = getElementText(PlansPage.PLANS_SECTION_TITLE);
        Assert.assertEquals("Validate Section Title",
                expectedSectionTitle,
                actualSectionTitle);
    }

    @Then("Validate Table row is {int}")
    public void validateTableRowsCount(int expectedRows) {
        int actualRowSize = getListOfElements(PlansPage.TABLE_ROW_LOCATOR).size();
        Assert.assertEquals("Validate Table Rows",
                expectedRows,
                actualRowSize);
    }

    @Then("Validate All Plans are Valid")
    public void validateAllPlansAreValid() {
        List<WebElement> elements = getListOfElements(PlansPage.PLAN_EXPIRED_COLUMN);

        for (WebElement element : elements) {
            String actualText = element.getText();
            Assert.assertEquals("Validate All Plans are Valid", "Valid", actualText);
        }
    }

    @Then("validate plan table header")
    public void validate_plan_table_header(DataTable dataTable) {
        // A data table as List<Lists>,
        // a data table as List<Maps>

        List<List<String>> tableAsList = dataTable.asLists();

        List<WebElement> headerElements = getListOfElements(PlansPage.PLAN_TABLE_HEADER_COLUMNS);

        List<String> expectedHeaders = tableAsList.get(0);

        for (int i = 0 ; i < headerElements.size(); i ++ ) {
            String actualHeader = headerElements.get(i).getText();
            String expectedHeader = expectedHeaders.get(i);

            Assert.assertEquals("Validate plan table header",
                    expectedHeader,
                    actualHeader);
        }
    }

}
