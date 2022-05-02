package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity7_1 {

    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));
        String loginmsg=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Successfully logged in");
        System.out.println("Login message: " + loginmsg);
        driver.close();

    }
}
