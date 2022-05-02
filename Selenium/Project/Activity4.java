package seleniumprojectactivities;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity4 {

    WebDriver driver;

    @BeforeTest
    public void openpage() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
  @Test
    public void verifyHeading() {
        WebElement ActualHeading = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2"));
        System.out.println("Actual heading is " + ActualHeading.getText());
        String ExpectedHeading="Quia quis non";
        Assert.assertEquals(ActualHeading.getText(), ExpectedHeading,"Heading not matched");
    }

    @AfterTest

    public void closepage() {

        driver.close();
    }
}
