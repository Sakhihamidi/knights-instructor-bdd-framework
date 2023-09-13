package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    //Encapsulation Concept of Java
    private static WebDriver driver;

    public void openBrowser() {
        //Targeting Chrome Browser.
        //Creating instance of Browser and navigate for Tek Insurance APP.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //Ready only Getter to read get Driver instance.
    //Java Encapsulation Concept.
    public WebDriver getDriver() {
        return driver;
    }

}
