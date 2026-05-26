package pages;

import org.openqa.selenium.WebDriver;
import wrappers.*;

import static wrappers.InputHelper.write;

public class NewAccountPage extends BasePage {

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://demo.suiteondemand.com/index.php?module=Accounts&action=EditView&return_module=" +
                "Accounts&return_action=DetailView");
    }

    public void createAccount(String name, String phone, String fax, String street,
                              String description, String type, String industry) {
        new Input(driver, "Name").write(name);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Office Phone").write(phone);
        new AddressTextarea(driver, "Billing Address", "Street").write(street);
        new AddressTextarea(driver, "Shipping Address", "Street").write(street);
        new TextArea(driver, "Description").write(description);
        new Select(driver, "Type").select(type);
        new Select(driver, "Industry").select(industry);
    }
}
