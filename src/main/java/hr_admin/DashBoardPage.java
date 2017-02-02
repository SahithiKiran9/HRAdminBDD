package hr_admin;

import hr_admin.BasePage;
import org.openqa.selenium.By;

/**
 * Created by User on 23/01/2017.
 */
public class DashBoardPage extends BasePage {
    public boolean verifyWelcomeMessage(String welcomeMessage) {
        return driver.findElement(By.id("welcome")).getText().equals(welcomeMessage);
    }

    public boolean verifyUserIsOnDashboardPage() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}
