package seleniumprojectactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity6 {

    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void jobpage() {
        driver.findElement(By.linkText("Jobs")).click();
        WebElement searchbox = driver.findElement(By.id("search_keywords"));
        searchbox.sendKeys("Banking");
        driver.findElement(By.xpath("//input[@type = 'submit' and @value='Search Jobs']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.cssSelector(".post-4475 > a:nth-child(1)")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
        WebElement Emaildetails = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/div/p"));
        System.out.println("Email details: " + Emaildetails.getText());
    }

    @AfterTest

    public void closepage() {

        driver.close();
    }
}
