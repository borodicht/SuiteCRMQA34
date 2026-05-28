package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(id = "user_name")
    WebElement userField;
    @FindBy(id = "username_password")
    WebElement passwordField;
    @FindBy(css = "[title='Log In']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage open() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        return this;
    }

    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return this;
    }

    public MainPage login(String user, String password) {
        userField.sendKeys(user);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }
}
