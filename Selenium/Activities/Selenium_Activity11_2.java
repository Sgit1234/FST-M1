package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.findElement(By.id("confirm")).click();
        Alert alerttext = driver.switchTo().alert();
        System.out.println("Alert message: " + alerttext.getText());
        alerttext.accept();
        System.out.println("Alert accepted");
        driver.findElement(By.id("confirm")).click();
        alerttext = driver.switchTo().alert();
        alerttext.dismiss();
        System.out.println("Alert dismissed");
        driver.close();
    }
}
