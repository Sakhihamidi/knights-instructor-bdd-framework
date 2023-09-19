package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {

    public final static By SECTION_TITLE = By.xpath("//mat-card-title[1]/strong");
    public final static By LOGIN_BUTTON = By.id("loginButton");

    public final static By USERNAME = By.name("username");
    public final static By PASSWORD = By.name("password");
}
