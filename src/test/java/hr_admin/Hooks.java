package hr_admin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import hr_admin.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 23/01/2017.
 */
public class Hooks {
    String browser = "Chrome";
    String baseURL = "http://sbtechnos11.trial52.orangehrmlive.com/";

    @Before
    public void startBrowser() {
        BrowserFactory.startBrowser(browser, baseURL);

    }

    @After
    public void stopBrowser() {
        BrowserFactory.stopBrowser();
    }

}
