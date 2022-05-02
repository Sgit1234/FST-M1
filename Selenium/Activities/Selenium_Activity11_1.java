package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.findElement(By.id("simple")).click();
        Alert alerttext = driver.switchTo().alert();
        System.out.println("Alert Message: " + alerttext.getText());
        alerttext.accept();
        driver.close();
    }
}
