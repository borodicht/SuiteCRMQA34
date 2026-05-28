package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.AddressTextarea;
import wrappers.Input;
import wrappers.Select;
import wrappers.TextArea;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountPage open() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=" +
                "Accounts&return_action=DetailView");
        return this;
    }

    public NewAccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//div[@id='EditView_tabs']/following-sibling::div[@class='buttons']/input[@title='Save']")));
        return this;
    }

    public NewAccountPage createAccount(Account account) {
        new Input(driver, "Name").write(account.getName());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Office Phone").write(account.getPhone());
        new AddressTextarea(driver, "Billing Address", "Street").write(account.getStreet());
        new AddressTextarea(driver, "Shipping Address", "Street").write(account.getStreet());
        new TextArea(driver, "Description").write(account.getDescription());
        new Select(driver, "Type").select(account.getType());
        new Select(driver, "Industry").select(account.getIndustry());
        return this;
    }

    public void saveNewAccount() {
        driver.findElement(By.xpath
                        ("//div[@id='EditView_tabs']/following-sibling::div[@class='buttons']/input[@title='Save']"))
                .click();
    }
}
