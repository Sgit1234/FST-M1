package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity5_1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        chkbox.click();
        System.out.println("Before removing, checkbox displayed is " + chkbox.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        System.out.println("After removing, checkbox displayed is " + chkbox.isDisplayed());
        driver.close();
    }
}
