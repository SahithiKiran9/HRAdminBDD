package hr_admin;

import hr_admin.utils.Utilities;
import org.openqa.selenium.By;

/**
 * Created by User on 23/01/2017.
 */
public class LoginPage extends BasePage {
    public boolean verifyUserIsOnLoginPage() {
        return driver.findElement(By.cssSelector("#frmLogin")).isDisplayed();
    }

    public void enterUserName(String username) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("txtPassword")).sendKeys(password);

    }

    public void selectLogin() {
        driver.findElement(By.id("btnLogin")).click();
    }

    public boolean verifyErrorMessage(String errorMessage) {
        return Utilities.isTextPresentAt(By.cssSelector("#spanMessage"),errorMessage);
    }
}
