package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity5_2 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Before: checkbox selected is " + chkbox.isSelected());
        chkbox.click();
        System.out.println("After: checkbox selected is " + chkbox.isSelected());
        driver.close();
    }
}
