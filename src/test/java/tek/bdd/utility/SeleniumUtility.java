package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    public String getElementText(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
}
