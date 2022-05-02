package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("Sunitha");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password1");
        driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]")).sendKeys("password1");
        driver.findElement(By.xpath("//label[text()='Email']/following::input[1]")).sendKeys("abc@xyz.com");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Thank you for registering, Sunitha"));
        String wlcmmsg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Sign Up message: " + wlcmmsg);
        driver.close();
    }
}
