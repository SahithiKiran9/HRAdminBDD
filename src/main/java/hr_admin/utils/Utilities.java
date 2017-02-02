package hr_admin.utils;

import hr_admin.BasePage;
import org.openqa.selenium.By;

/**
 * Created by User on 23/01/2017.
 */
public class Utilities extends BasePage {

    //is element present

    //wait for element present

    //wait for text present

    //is text present on the page

    //is text present at particular location/element
    public static boolean isTextPresentAt(By element, String text) {
        return driver.findElement(element).getText().contains(text);
    }

    //select from list

    //..........so on



}
