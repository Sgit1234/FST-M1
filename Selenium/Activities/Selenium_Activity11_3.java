package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.findElement(By.id("prompt")).click();
        Alert alerttext = driver.switchTo().alert();
        alerttext.sendKeys("Yes, you are!");
        alerttext.accept();
        driver.close();
    }
}
