package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_Activity6_1 {

    public static void main(String[] args)
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        WebElement chkbox=driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        driver.findElement(By.id("toggleCheckbox")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(chkbox));
        System.out.println("Before state: Checkbox disappeared");
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOf(chkbox));
        driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input")).click();
        System.out.println("After state: Checkbox is selected now");
        driver.close();


    }
}
