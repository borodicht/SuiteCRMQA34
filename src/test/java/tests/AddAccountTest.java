package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddAccountTest extends BaseTest {

    @Test
    public void checkAddAccount() throws InterruptedException {
        driver.get("https://demo.suiteondemand.com/index.php?module=Users&action=Login");
        driver.findElement(By.id("user_name")).sendKeys("will");
        driver.findElement(By.id("username_password")).sendKeys("will");
        driver.findElement(By.cssSelector("[title='Log In']")).click();

        newAccountPage.open();
        newAccountPage.createAccount(
                "test",
                "+23456789",
                "+12345678",
                "test",
                "test",
                "Integrator",
                "Energy");
    }
}
