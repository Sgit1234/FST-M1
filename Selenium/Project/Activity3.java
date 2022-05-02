package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity3 {
    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void headerimage()
    {
        WebElement imageURL = driver.findElement(By.cssSelector(".attachment-large"));
        System.out.println("The URL of the header image is " + imageURL.getAttribute("src"));

    }
    @AfterTest

    public void closepage() {

        driver.close();
    }
}
