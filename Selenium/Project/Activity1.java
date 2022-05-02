package seleniumprojectactivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity1 {

    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void titlecheck()

    {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Alchemy Jobs – Job Board Application";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title does not match");

    }

    @AfterTest

    public void closepage() {

        driver.close();
    }

}