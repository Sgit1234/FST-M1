package seleniumprojectactivities;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {

    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void jobpage() {
        driver.findElement(By.linkText("Jobs")).click();
        String Actualtitle = driver.getTitle();
        String Expectedtitle = "Jobs – Alchemy Jobs";
        Assert.assertEquals(Actualtitle, Expectedtitle,"Title does not match");
        System.out.println("Title matches");
    }

    @AfterTest

    public void closepage() {

        driver.close();
    }
}