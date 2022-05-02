package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity6_2 {

    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        String ajxtxt = driver.findElement(By.id("ajax-content")).getText();
        System.out.println("Text on the Ajax page: " + ajxtxt);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
        String ajxtxt2 = driver.findElement(By.xpath("//h3")).getText();
        System.out.println("Second Text on the Ajax page: " + ajxtxt2);
        driver.close();

    }
}
